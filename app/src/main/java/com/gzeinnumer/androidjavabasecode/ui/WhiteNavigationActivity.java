package com.gzeinnumer.androidjavabasecode.ui;

import android.os.Bundle;

import com.gzeinnumer.androidjavabasecode.R;
import com.gzeinnumer.javabase.base.activity.BaseActivityBlackBlackNavigation;


//android:theme="@style/Theme.MyBaseCode.White"
public class WhiteNavigationActivity extends BaseActivityBlackBlackNavigation {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_white_navigation);
    }
}