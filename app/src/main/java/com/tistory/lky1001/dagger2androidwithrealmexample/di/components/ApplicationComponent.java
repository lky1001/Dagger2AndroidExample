package com.tistory.lky1001.dagger2androidwithrealmexample.di.components;

import android.app.Activity;

import com.tistory.lky1001.dagger2androidwithrealmexample.MainActivity;
import com.tistory.lky1001.dagger2androidwithrealmexample.MyApplication;
import com.tistory.lky1001.dagger2androidwithrealmexample.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by lee on 2016. 8. 16..
 */
@Singleton
@Component(modules = {
        ApplicationModule.class
})
public interface ApplicationComponent {

    void inject(MyApplication app);
    void inject(Activity activity);
    void inject(MainActivity activity);
}
