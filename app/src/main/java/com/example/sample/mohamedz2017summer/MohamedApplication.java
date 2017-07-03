package com.example.sample.mohamedz2017summer;

import android.app.Application;

import com.example.sample.mohamedz2017summer.util.UtilLog;

/**
 * Created by zaeem on 6/20/2017.
 */

public class MohamedApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        UtilLog.setIsLog(true);
    }
}
