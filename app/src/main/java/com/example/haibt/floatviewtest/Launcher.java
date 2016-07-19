package com.example.haibt.floatviewtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Launcher extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_launcher);

        finish();
        Intent intent = new Intent(this, FloatViewService.class);
        startService(intent);
    }
}
