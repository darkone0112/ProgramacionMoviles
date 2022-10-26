package com.example.trainapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class display extends AppCompatActivity{
    TextView displayBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        displayBox = findViewById(R.id.displayBox);
        //display viaje = (display) getIntent().getSerializableExtra("laclave");
        //displayBox.setText(viaje.toString());
        Intent i = getIntent();
        displayBox.setText(i.getStringExtra(MainActivity.laclave));
    }
}