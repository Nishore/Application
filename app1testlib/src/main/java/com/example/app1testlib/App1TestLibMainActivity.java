package com.example.app1testlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class App1TestLibMainActivity extends AppCompatActivity {
    public static final String TAG = App1TestLibMainActivity.class.getSimpleName();
    public int Index = 6;

    public App1TestLibMainActivity (){
        Log.d(TAG,":==> App1TestLib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app1_test_lib_main);
        Log.d(TAG,":==> App1TestLib");
    }
}
