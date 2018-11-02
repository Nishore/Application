package com.example.cipl0610.application2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.app2lib.App2LibMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App2LibMainActivity mApp2LibMainActivity = new App2LibMainActivity();
        int data = mApp2LibMainActivity.Index;
        Log.e("Data",":==>"+data);
    }
}
