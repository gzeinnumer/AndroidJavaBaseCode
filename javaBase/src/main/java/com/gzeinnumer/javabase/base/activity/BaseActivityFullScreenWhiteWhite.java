package com.gzeinnumer.javabase.base.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.annotation.Nullable;

import com.gzeinnumer.javabase.base.BaseActivity;

//android:theme="@style/Theme.MyBaseCode.FullScreen.Color"
public class BaseActivityFullScreenWhiteWhite extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setFullScreen();
        setForceImmersiveScreen();
    }

    protected void setPaddingToTopParentView(View view) {
        int statusBarHeight = getStatusBarHeight(this);
        view.setPadding(0, statusBarHeight, 0, 0);
    }

    public int getStatusBarHeight(Activity activity) {
        int result = 0;
        int resourceId = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = activity.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    private void setForceImmersiveScreen() {
        final Handler forceImmersive = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                setFullScreen();

                forceImmersive.postDelayed(this, 5000);
            }
        };

        forceImmersive.postDelayed(runnable, 5000);
    }

    protected void setFullScreen() {
        int decore = View.SYSTEM_UI_FLAG_IMMERSIVE
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                // Hide the nav bar and status bar
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            //enable this tho maker icon status bar become black
//            decore += View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            //enable this tho maker icon Navigation bar become black
//            decore += View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR;
        }

        getWindow().getDecorView().setSystemUiVisibility(decore);
    }
}
