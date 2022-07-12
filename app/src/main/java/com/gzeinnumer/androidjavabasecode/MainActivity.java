package com.gzeinnumer.androidjavabasecode;

import android.os.Bundle;

import com.gzeinnumer.androidjavabasecode.ui.ColorNavigationActivity;
import com.gzeinnumer.androidjavabasecode.ui.DefaultActivity;
import com.gzeinnumer.androidjavabasecode.ui.FullScreenActivity;
import com.gzeinnumer.androidjavabasecode.ui.FullScreenColorActivity;
import com.gzeinnumer.androidjavabasecode.ui.WhiteNavigationActivity;
import com.gzeinnumer.javabase.base.activity.BaseActivityWhiteBlackNavigation;

public class MainActivity extends BaseActivityWhiteBlackNavigation {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(v -> intentTo(WhiteNavigationActivity.class));
        findViewById(R.id.btn2).setOnClickListener(v -> intentTo(ColorNavigationActivity.class));
        findViewById(R.id.btn3).setOnClickListener(v -> intentTo(FullScreenActivity.class));
        findViewById(R.id.btn4).setOnClickListener(v -> intentTo(FullScreenColorActivity.class));
        findViewById(R.id.btn5).setOnClickListener(v -> intentTo(DefaultActivity.class));
        findViewById(R.id.btn6).setOnClickListener(v -> debugDialog("{name:zein}"));
    }
}