package com.fkahraman.daggerexamplewithdependencyinjection.Injector;

import com.fkahraman.daggerexamplewithdependencyinjection.Dagger2Application;
import com.fkahraman.daggerexamplewithdependencyinjection.Model.Car;
import com.fkahraman.daggerexamplewithdependencyinjection.Model.Engine;
import com.fkahraman.daggerexamplewithdependencyinjection.Model.car.BMWCar;
import com.fkahraman.daggerexamplewithdependencyinjection.Model.engine.LPGEngine;
import com.fkahraman.daggerexamplewithdependencyinjection.Model.engine.PetrolEngine;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final Dagger2Application dagger2Application;

    public AppModule(Dagger2Application dagger2Application) {
        this.dagger2Application = dagger2Application;
    }

    @Provides @Singleton
    Dagger2Application provideApp(){
        return dagger2Application;
    }

    @Provides @Singleton
    Engine provideEngine(){
        return new LPGEngine();
    }

    @Provides @Singleton
    Car provideCar(Engine engine){
        return new BMWCar(engine);
    }

}
