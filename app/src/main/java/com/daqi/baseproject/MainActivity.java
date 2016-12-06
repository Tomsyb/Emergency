package com.daqi.baseproject;

import android.os.Bundle;

import com.daqi.baseproject.base.B_BaseActivity;
import com.daqi.baseproject.utils.U_LogUtils;

public class MainActivity extends B_BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        U_LogUtils.e("------------------------------------caoni");
    }
}
