package com.gzeinnumer.androidjavabasecode.ui;

import android.os.Bundle;

import com.gzeinnumer.androidjavabasecode.R;
import com.gzeinnumer.javabase.base.activity.BaseActivityFullScreenWhiteWhite;

//android:theme="@style/Theme.MyBaseCode.FullScreen.Color"
public class FullScreenColorActivity extends BaseActivityFullScreenWhiteWhite {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_color);

//        setPaddingToTopParentView(findViewById(R.id.parent));
    }
}