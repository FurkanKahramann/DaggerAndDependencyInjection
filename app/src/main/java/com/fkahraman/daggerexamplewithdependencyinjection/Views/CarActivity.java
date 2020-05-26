package com.fkahraman.daggerexamplewithdependencyinjection.Views;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.fkahraman.daggerexamplewithdependencyinjection.Dagger2Application;
import com.fkahraman.daggerexamplewithdependencyinjection.Model.Car;
import com.fkahraman.daggerexamplewithdependencyinjection.R;

import javax.inject.Inject;

public class CarActivity extends Activity {
    //https://medium.com/mobiwise-blog/dagger-2-ve-android-dependency-injection-1-e9b8e9dc26f1
    //https://medium.com/mobiwise-blog/dagger-2-ve-android-dependency-injection-2-921d5c51bc3b
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        inject();

        car.start();
        car.stop();

    }

    private void inject(){
        Dagger2Application app = (Dagger2Application)  getApplication();
        app.getAppComponent().inject(this);
    }
}
