package com.example.currencyconverter_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        Integer num = Integer.parseInt(intent.getStringExtra("amount"));
        String adjustedNum = Double.toString(num*0.77);
        textView2.setText("£ " + adjustedNum);
    }
}
