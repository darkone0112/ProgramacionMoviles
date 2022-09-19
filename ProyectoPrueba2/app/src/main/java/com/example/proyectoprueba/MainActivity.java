package com.example.proyectoprueba;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView lSalida;
    Button bContador;
    Button bReset;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lSalida = findViewById(R.id.lSalida);
        bContador = findViewById(R.id.bContador);
        bContador.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    i++;
                    lSalida.setText(String.valueOf(i));

                    }
                }
        );
        bReset = findViewById(R.id.bReset);
        bReset.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        i = 0;
                        lSalida.setText(String.valueOf(i));

                    }
                }
        );
        }
}
