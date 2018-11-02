package com.example.app2lib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class App2LibMainActivity extends AppCompatActivity {
    public static final String TAG = App2LibMainActivity.class.getSimpleName();
     public int Index = 5;

    public App2LibMainActivity (){
        Log.d(TAG,":==> App2Lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app2_lib_main);
        Log.d(TAG,":==> App2Lib");
    }
}
