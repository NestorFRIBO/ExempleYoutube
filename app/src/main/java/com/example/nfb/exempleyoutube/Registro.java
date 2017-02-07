package com.example.nfb.exempleyoutube;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    CheckBox chec;
    Button registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registre);
        getSupportActionBar().hide();

        chec = (CheckBox) findViewById(R.id.checkBox);
        registro = (Button) findViewById(R.id.btnRegis);

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                if (chec.isChecked()) {
                    startActivity(i);

                }else {

                    AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());


                    builder.setTitle("Terminos de uso").setMessage("Acepta los permisos para continuar");

                    builder.setPositiveButton("Acepto", new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int id) {
                           chec.setChecked(true);
                            Toast.makeText(getApplicationContext(),"Has aceptado",Toast.LENGTH_SHORT).show();

                        }});

                    builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int id) {
                            Toast.makeText(getApplicationContext(),"Has seleccionado Cancelar",Toast.LENGTH_SHORT).show();
                        }});

                    AlertDialog dialog = builder.create();

                    dialog.show();


                }
            }
        });

    }
}
