/*
 * Copyright (c) 2019. dotrinh
 */

package com.dotrinh.applib;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.dotrinh.protool.CustomSharedPreference;
import com.dotrinh.protool.StringTool;

import static com.dotrinh.protool.LogUtil.LogI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String random = StringTool.getRandomString(100);
        LogI(random);
        CustomSharedPreference.setBooleanSharedPreference(this, "installed",true);
        CustomSharedPreference.getBooleanSharedPreference(this, "installed");
    }
}
