package com.smedic.tubtub;

import android.app.Application;
import android.content.Context;

public class YTApplication extends Application {

    private static Context mContext;

    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getAppContext() {
        return mContext;
    }

}
