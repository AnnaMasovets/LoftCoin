package com.aashagunova.loftcoin;

import android.app.Application;
import android.os.StrictMode;

import com.aashagunova.loftcoin.util.DebugTree;

import timber.log.Timber;

public class LoftApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            StrictMode.enableDefaults();
            Timber.plant(new DebugTree());
        }
    }
}
