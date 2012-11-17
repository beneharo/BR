package com.example.br;

import android.os.Bundle;
import org.apache.cordova.*;

import android.app.Activity;
import android.view.Menu;

public class Principal extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actividad_principal, menu);
        return true;
    }
}
