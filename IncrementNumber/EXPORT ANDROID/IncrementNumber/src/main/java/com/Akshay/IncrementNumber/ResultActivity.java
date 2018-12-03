package com.Akshay.IncrementNumber;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent i = getIntent();

        /*int r;
        Bundle extras = getIntent().getExtras();
                if (extras != null)
                {
                    String result = extras.getString("result");
                }
*/
        int r = getIntent().getIntExtra("result", 0);
       //  String r = i.getStringExtra("result");   //     StringExtra("result");  //  Extra("result").getString("result").toString();
        System.out.println(r);

        TextView resultTextView = (TextView) findViewById(R.id.disp_result);
        resultTextView.setText(r);
    }


}
