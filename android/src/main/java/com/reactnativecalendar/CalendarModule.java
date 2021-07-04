package com.reactnativecalendar;

import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = CalendarModule.NAME)
public class CalendarModule extends ReactContextBaseJavaModule {
    public static final String NAME = "Calendar";

    public CalendarModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    @NonNull
    public String getName() {
        return NAME;
    }

    static {
        try {
            // Used to load the 'native-lib' library on application startup.
            System.loadLibrary("cpp");
        } catch (Exception ignored) {
        }
    }

    private native void nativeInstall(long jsi);
    public void installLib(JavaScriptContextHolder reactContext) {
      if (reactContext.get() != 0){
        this.nativeInstall(reactContext.get());
      } else {
        Log.e("CalendarModule", "JSI Runtime is not available in debug mode");
      }
    }
}

