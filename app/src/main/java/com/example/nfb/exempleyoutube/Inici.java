package com.example.nfb.exempleyoutube;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Inici extends AppCompatActivity {

    Button Registro;
    Button Entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);


        Registro= (Button) findViewById(R.id.Registrar);
        Entrar= (Button) findViewById(R.id.Entrar);

        Registro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent pasarR = new Intent(getApplicationContext(), Registro.class);
                startActivity(pasarR);
            }
        });

        Entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasarM = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(pasarM);

            }
        });
    }
}
