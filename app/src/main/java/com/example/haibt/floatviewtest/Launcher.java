package com.example.haibt.floatviewtest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class Launcher extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_launcher);

        finish();
        Intent intent = new Intent(this, FloatViewService.class);
        startService(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
