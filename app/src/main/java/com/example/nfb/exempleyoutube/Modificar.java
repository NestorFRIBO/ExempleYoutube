package com.example.nfb.exempleyoutube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Modificar extends AppCompatActivity {

    EditText Enombre;
    EditText Enick;
    EditText Eemail;
    EditText Eantigua;
    EditText Enueva;
    Button Aceptar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar);

        Enombre = (EditText) findViewById(R.id.editNombre);
        Enick = (EditText) findViewById(R.id.editNick);
        Eemail = (EditText) findViewById(R.id.editEmail);
        Eantigua = (EditText) findViewById(R.id.editCAntigua);
        Enueva = (EditText) findViewById(R.id.editCNueva);
        Aceptar = (Button) findViewById(R.id.btnAceptar);

        Aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

            }
        });
    }


}
