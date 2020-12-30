package me.jadenyjw.droneai;

import android.app.Application;

public class DroneAIApplication extends Application{

    private Application instance;


    @Override
    public void onCreate() {
        super.onCreate();
    }

    public void setContext(Application application) {
        instance = application;
    }
}