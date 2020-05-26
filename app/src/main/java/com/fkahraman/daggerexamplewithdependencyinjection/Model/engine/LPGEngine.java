package com.fkahraman.daggerexamplewithdependencyinjection.Model.engine;

import android.util.Log;

import com.fkahraman.daggerexamplewithdependencyinjection.Model.Engine;

public class LPGEngine implements Engine {

    @Override
    public void turnOn() {
        Log.v("DaggerExample", "LPG Engine turned on");
    }

    @Override
    public void turnOff() {
        Log.v("DaggerExample", "LPG Engine turned off.");
    }
}
