package com.example.sample.mohamedz2017summer.util;

import android.util.Log;

/**
 * Created by zaeem on 6/20/2017.
 */

public class UtilLog {

    private static boolean isLog = false;

    public static void setIsLog(Boolean b){
        isLog= b;
    }

    public static void d(String tag, String msg) {
        if (isLog) {
            Log.d(tag, msg);
        }
    }

}
