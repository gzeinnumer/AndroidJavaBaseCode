package com.gzeinnumer.androidjavabasecode.ui;

import android.os.Bundle;

import com.gzeinnumer.androidjavabasecode.R;
import com.gzeinnumer.javabase.base.activity.BaseActivityWhiteBlackNavigation;

//no theme
public class DefaultActivity extends BaseActivityWhiteBlackNavigation {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);
    }
}