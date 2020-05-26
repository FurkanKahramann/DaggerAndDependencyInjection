package com.fkahraman.daggerexamplewithdependencyinjection.Injector;

import com.fkahraman.daggerexamplewithdependencyinjection.Views.CarActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton @Component(modules = AppModule.class)
public interface AppComponent {
    void inject(CarActivity carActivity);
}
