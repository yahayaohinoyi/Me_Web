package com.example.yahaya.dsc;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PreferenceUtils {
    public static void UpdateScore(Context context,int score){
        SharedPreferences sharedPreferences=PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putInt("Scorekey",score);
        editor.commit();

    }
    public static int getscore(Context context){

        SharedPreferences sharedPreferences=PreferenceManager.getDefaultSharedPreferences(context);
        return sharedPreferences.getInt("Scorekey",0);
    }
}
