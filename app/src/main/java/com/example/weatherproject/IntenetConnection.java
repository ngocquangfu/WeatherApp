package com.example.weatherproject;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class IntenetConnection {
    public static  boolean checkConnect(Context context){
        final ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager != null){
            NetworkInfo info = connectivityManager.getActiveNetworkInfo();
            if (info !=null){
                if(info.getType() == connectivityManager.TYPE_WIFI){
                    return true;
                }else{
                    return info.getType() ==ConnectivityManager.TYPE_MOBILE;
                }
            }
        }
        return false;
    }
}
