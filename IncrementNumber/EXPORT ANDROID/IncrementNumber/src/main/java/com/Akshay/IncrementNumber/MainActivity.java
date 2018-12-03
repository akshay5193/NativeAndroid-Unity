package com.Akshay.IncrementNumber;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getInputNumber(View view) {
        EditText refToInputNumberEditText = (EditText) findViewById(R.id.input);
        int number = Integer.parseInt(refToInputNumberEditText.getText().toString());

        Intent intent = new Intent(this, UnityPlayerActivity.class);
        intent.putExtra("arguments", number);

        startActivity(intent);
    }
}
