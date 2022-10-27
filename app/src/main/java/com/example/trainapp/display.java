package com.example.trainapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class display extends AppCompatActivity implements View.OnClickListener {
    TextView displayBox;
    Button goBackBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        displayBox = findViewById(R.id.displayBox);
        goBackBtn = findViewById(R.id.goBackBtn);
        //display viaje = (display) getIntent().getSerializableExtra("laclave");
        //displayBox.setText(viaje.toString());
        Intent i = getIntent();
        displayBox.setText(i.getStringExtra(MainActivity.laclave));
        goBackBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent goBack = new Intent(this, MainActivity.class);
        startActivity(goBack);
    }
}