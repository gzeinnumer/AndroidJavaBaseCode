package com.gzeinnumer.javabase.utils;


import android.content.Context;
import android.widget.Toast;

import com.gzeinnumer.javabase.BuildConfig;

public class GblFunction {

    public static void debugLocationActivity(Context applicationContext, String simpleName) {
        if (isDebugActive()) {
            Toast.makeText(applicationContext, simpleName, Toast.LENGTH_SHORT).show();
        }
    }

    public static boolean isDebugActive() {
        return BuildConfig.DEBUG;
    }
}
