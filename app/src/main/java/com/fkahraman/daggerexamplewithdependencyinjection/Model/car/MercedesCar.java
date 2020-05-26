package com.fkahraman.daggerexamplewithdependencyinjection.Model.car;

import android.util.Log;

import com.fkahraman.daggerexamplewithdependencyinjection.Model.Car;
import com.fkahraman.daggerexamplewithdependencyinjection.Model.Engine;

import javax.inject.Inject;

public class MercedesCar implements Car {

    Engine engine;

    @Inject
    public MercedesCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        Log.v("DaggerExample","Mercedes Car is about to start.");
        engine.turnOn();
    }

    @Override
    public void stop() {
        Log.v("DaggerExample","Mercedes Car is about to stop.");
        engine.turnOff();
    }
}
