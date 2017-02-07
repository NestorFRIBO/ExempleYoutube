package com.example.nfb.exempleyoutube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cuenta extends AppCompatActivity {

    Button btnModif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta);
        getSupportActionBar().hide();

        btnModif = (Button) findViewById(R.id.btnModificar);

        btnModif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Modificar.class);
                startActivity(i);
            }
        });
    }
}
