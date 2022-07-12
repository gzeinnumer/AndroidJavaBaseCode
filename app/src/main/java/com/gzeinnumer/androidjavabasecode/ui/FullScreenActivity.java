package com.gzeinnumer.androidjavabasecode.ui;

import android.os.Bundle;

import com.gzeinnumer.androidjavabasecode.R;
import com.gzeinnumer.javabase.base.activity.BaseActivityFullScreenWhiteBlack;


//android:theme="@style/Theme.MyBaseCode.FullScreen"
public class FullScreenActivity extends BaseActivityFullScreenWhiteBlack {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        //add this
//        setPaddingToTopParentView(findViewById(R.id.parent));
    }
}