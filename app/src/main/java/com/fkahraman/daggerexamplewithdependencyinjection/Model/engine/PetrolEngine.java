package com.fkahraman.daggerexamplewithdependencyinjection.Model.engine;

import android.util.Log;

import com.fkahraman.daggerexamplewithdependencyinjection.Model.Engine;

public class PetrolEngine implements Engine {

    @Override
    public void turnOn() {
        Log.v("DaggerExample", "Petrol Engine turned on");
    }

    @Override
    public void turnOff() {
        Log.v("DaggerExample", "Petrol Engine turned off.");
    }
}
