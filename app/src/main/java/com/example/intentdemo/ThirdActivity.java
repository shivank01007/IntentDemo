package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {


    Button googleButton,searchButton;
    EditText searchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        googleButton = findViewById(R.id.button4);
        googleButton.setOnClickListener(v -> {
            Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com"));
            startActivity(i);
        });

        searchButton = findViewById(R.id.button5);
        searchButton.setOnClickListener(v -> {
            searchText = findViewById(R.id.searchText);
            String search = searchText.getText().toString();
            Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?q="+search));
            startActivity(i);
        });
    }
}
