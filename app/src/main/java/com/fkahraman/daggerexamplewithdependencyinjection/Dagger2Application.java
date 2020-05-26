package com.fkahraman.daggerexamplewithdependencyinjection;

import android.app.Application;

import com.fkahraman.daggerexamplewithdependencyinjection.Injector.AppComponent;
import com.fkahraman.daggerexamplewithdependencyinjection.Injector.AppModule;
import com.fkahraman.daggerexamplewithdependencyinjection.Injector.DaggerAppComponent;

public class Dagger2Application extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        initializeInjector();

    }

    private void initializeInjector(){
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }

}
