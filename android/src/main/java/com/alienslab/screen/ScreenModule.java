package com.alienslab.screen;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by Bilal on 6/13/2017.
 */

public class ScreenModule extends ReactContextBaseJavaModule {

    public ScreenModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "Screen";
    }

    @ReactMethod
    public void setScreenTitle(String title) {
        Log.d("Screen", "Setting screen title: "+title);
        getCurrentActivity().setTitle(title);
    }

}
