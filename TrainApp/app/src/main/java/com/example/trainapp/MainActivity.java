package com.example.trainapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    public Spinner spinner,spinner1;
    public TextView fechaida,fechavuelta,nombre,dni;
    public ToggleButton idavuelta;
    public Button btn;
    public static String [] options = new String[]{"Madrid","Santiago","Santander"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner)findViewById(R.id.spinner);
        spinner1 = (Spinner)findViewById(R.id.spinner1);
        fechaida = findViewById(R.id.fechaIda);
        fechavuelta = findViewById(R.id.fechaVuelta);
        nombre = findViewById(R.id.nombre);
        dni = findViewById(R.id.dni);
        idavuelta = findViewById(R.id.idavuelta);
        btn = findViewById(R.id.btn);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item,options);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(this);
        fechaida.setOnClickListener(this);
        fechavuelta.setOnClickListener(this);
        idavuelta.setOnClickListener(this);
        btn.setOnClickListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:

                break;
            case 1:

                break;

            case 2:

                break;
        }
    }


    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.idavuelta:
                    if (idavuelta.isChecked()){
                        fechavuelta.setClickable(true);
                        fechavuelta.setEnabled(true);
                        fechavuelta.setText("Fecha Vuelta");
                    }else{
                        fechavuelta.setClickable(false);
                        fechavuelta.setEnabled(false);
                        fechavuelta.setText("Sin Regreso");

                    }
                break;
        }
    }
}