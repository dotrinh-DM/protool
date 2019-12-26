/*
 * Copyright (c) 2019. dotrinh
 */

package com.dotrinh.protool;


import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class CustomSharedPreference {

    public static void setIntSharedPreference(Context context, String nameToSet, int value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(BuildConfig.APPLICATION_ID, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(nameToSet, value);
        editor.apply();
    }

    public static int getIntSharedPreference(Context ctx, String nameToGet) {
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(BuildConfig.APPLICATION_ID, MODE_PRIVATE);
        return sharedPreferences.getInt(nameToGet,0);
    }

    public static void setBooleanSharedPreference(Context context, String nameToSet, Boolean value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(BuildConfig.APPLICATION_ID, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(nameToSet, value);
        editor.apply();
    }


    //default false
    public static Boolean getBooleanSharedPreference(Context ctx, String nameToGet) {
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(BuildConfig.APPLICATION_ID, MODE_PRIVATE);
        return sharedPreferences.getBoolean(nameToGet, false);
    }

    public static Boolean getFirstRun(Context ctx, String nameToGet) {
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(BuildConfig.APPLICATION_ID, MODE_PRIVATE);
        return sharedPreferences.getBoolean(nameToGet, true);
    }
}
