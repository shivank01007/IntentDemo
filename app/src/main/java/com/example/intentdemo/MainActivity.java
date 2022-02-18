package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button firstButton , thirdButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstButton = findViewById(R.id.button1);
        thirdButton = findViewById(R.id.button3);

        firstButton.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(),SecondActivity.class);
            startActivity(i);
        });

        thirdButton.setOnClickListener(v -> {
            Intent j = new Intent(getApplicationContext(),ThirdActivity.class);
            startActivity(j);
        });
    }
}