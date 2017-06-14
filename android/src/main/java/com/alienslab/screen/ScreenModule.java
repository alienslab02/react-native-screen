package com.alienslab.screen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;

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
    public void setScreenTitle(final String title) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                getCurrentActivity().setTitle(title);
            }
        });
    }

}
