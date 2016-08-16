package com.tistory.lky1001.dagger2androidwithrealmexample;

import android.app.Application;

import com.tistory.lky1001.dagger2androidwithrealmexample.di.components.ApplicationComponent;
import com.tistory.lky1001.dagger2androidwithrealmexample.di.components.DaggerApplicationComponent;
import com.tistory.lky1001.dagger2androidwithrealmexample.di.modules.ApplicationModule;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by lee on 2016. 8. 16..
 */
public class MyApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // realm 설정
        initRealmConfiguration();
        // dagger application component 설정
        initApplicationComponent();
    }

    private void initRealmConfiguration() {
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(this)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }

    private void initApplicationComponent() {
        this.applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
