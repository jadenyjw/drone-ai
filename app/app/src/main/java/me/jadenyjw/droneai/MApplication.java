package me.jadenyjw.droneai;

import android.app.Application;
import android.content.Context;

import com.secneo.sdk.Helper;

public class MApplication extends Application {

    private DroneAIApplication droneAIApplication;
    @Override
    protected void attachBaseContext(Context paramContext) {
        super.attachBaseContext(paramContext);
        Helper.install(MApplication.this);
        if (droneAIApplication == null) {
            droneAIApplication = new DroneAIApplication();
            droneAIApplication.setContext(this);
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        droneAIApplication.onCreate();
    }

}