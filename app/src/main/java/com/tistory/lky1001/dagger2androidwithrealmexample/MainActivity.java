package com.tistory.lky1001.dagger2androidwithrealmexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.tistory.lky1001.dagger2androidwithrealmexample.model.RealmTest;

import javax.inject.Inject;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    @Inject
    Realm mRealm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication) getApplication())
                .getApplicationComponent()
                .inject(this);

        RealmTest test = new RealmTest();
        test.setId(2);
        test.setName("i am tester");

        mRealm.beginTransaction();
        mRealm.insert(test);
        mRealm.commitTransaction();
    }

    @Override
    protected void onResume() {
        super.onResume();

        RealmTest test = mRealm.where(RealmTest.class).equalTo("id", 2).findFirst();

        Log.i(MainActivity.class.getSimpleName(), test.getName());
    }
}
