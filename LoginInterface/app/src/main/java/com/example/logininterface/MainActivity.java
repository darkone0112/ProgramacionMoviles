package com.example.logininterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public TextView email,password;
    public ImageButton kebabbtn;
    public ImageView bsod;
    public Boolean flag = false;
    public static String laclave = "laclave";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        bsod = findViewById(R.id.bsod);
        password = findViewById(R.id.password);
        kebabbtn = findViewById(R.id.kebabbtn);
        kebabbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.kebabbtn:
                checkData();
            break;
            default:

            break;
        }
    }
    public void visibility(){
        if (bsod.getVisibility() == View.INVISIBLE){
            bsod.setVisibility(View.VISIBLE);
        }else{
            bsod.setVisibility(View.INVISIBLE);
        }
    }
    public void checkData(){
        Pattern emailPatter = Pattern.compile("^(.+)@(.+)$");
        Matcher emailMat = emailPatter.matcher(email.getText().toString());
        if(emailMat.matches()){
            Intent lanzar = new Intent(this,Welcome.class);
            lanzar.putExtra(laclave,"hola");
            startActivity(lanzar);
        }else{
            visibility();

        }
    }
}