package com.gzeinnumer.androidjavabasecode.ui;

import android.os.Bundle;

import com.gzeinnumer.androidjavabasecode.R;
import com.gzeinnumer.javabase.base.activity.BaseActivityBlackWhiteNavigation;

//android:theme="@style/Theme.MyBaseCode.Primary"
public class ColorNavigationActivity extends BaseActivityBlackWhiteNavigation {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_navigation);
    }
}