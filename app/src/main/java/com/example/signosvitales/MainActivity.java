package com.example.signosvitales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText CorreoLogin, ContraseñaLogin;
    Button IniciarSesion;
    Button Registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CorreoLogin.findViewById(R.id.txtCorreoLogin);
        ContraseñaLogin.findViewById(R.id.txtContraseñaLogin);


        Registrar = (Button) findViewById(R.id.btnRegistrarLogin);
        Registrar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent Registrar = new Intent(MainActivity.this, Registro.class);
                startActivity(Registrar);
            }
        });


    }
}