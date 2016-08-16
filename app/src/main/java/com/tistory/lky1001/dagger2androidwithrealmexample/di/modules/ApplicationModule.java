package com.tistory.lky1001.dagger2androidwithrealmexample.di.modules;

import android.app.Application;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;

/**
 * Created by lee on 2016. 8. 16..
 */
@Module
public class ApplicationModule {

    private Application mApplication;

    public ApplicationModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    public Realm provideRealm() {
        return Realm.getDefaultInstance();
    }
}
