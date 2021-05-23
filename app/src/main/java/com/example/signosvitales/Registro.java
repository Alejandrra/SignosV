package com.example.signosvitales;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.app.AlertDialog;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Registro extends AppCompatActivity
{

    EditText CorreoRegistro, usuario, ContraseñaRegistro, edad;
    Button Registar, Volver;

    //atributos para firebase
    private FirebaseAuth firebaseAuth;
    private DatabaseReference databaseReference;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        //Tabla en firebase
        firebaseAuth = FirebaseAuth.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference("Persona");

        CorreoRegistro.findViewById(R.id.txtCorreoLogin);
        usuario.findViewById(R.id.txtUsuario);
        ContraseñaRegistro.findViewById(R.id.txtContraseñaRegistro);
        edad.findViewById(R.id.txtEdad);


        Registar.findViewById(R.id.btnregistrar);
        Volver = (Button) findViewById(R.id.btnvolver);
        progressBar = new ProgressBar(this);
        Volver.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent Volver = new Intent(Registro.this, MainActivity.class);
                startActivity(Volver);
            }
        });


        Registar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                final String regex = "(?:[^<>()\\[\\].,;:\\s@\"]+(?:\\.[^<>()\\[\\].,;:\\s@\"]+)*|\"[^\\n\"]+\")@(?:[^<>()\\[\\].,;:\\s@\"]+\\.)+[^<>()\\[\\]\\.,;:\\s@\"]{2,63}";

                String corrR = CorreoRegistro.getText().toString().trim();
                String Usu = usuario.getText().toString().trim();
                String contraR = ContraseñaRegistro.getText().toString().trim();
                String Eda = edad.getText().toString().trim();

                if (TextUtils.isEmpty(corrR))
                {
                    Toast.makeText(Registro.this, "Debes escribir un correo", Toast.LENGTH_LONG).show();
                    CorreoRegistro.requestFocus();
                    return;

                }

                if (corrR.matches(regex))
                {
                    Toast.makeText(Registro.this, "El formato de correo es incorrecto", Toast.LENGTH_LONG).show();
                    CorreoRegistro.requestFocus();
                    return;

                }

                if (TextUtils.isEmpty(Usu))
                {
                    Toast.makeText(Registro.this, "Debes escribir un nombre de usuario", Toast.LENGTH_LONG).show();
                    usuario.requestFocus();
                    return;

                }

                if (TextUtils.isEmpty(contraR))
                {
                    Toast.makeText(Registro.this, "Debes escribir una contraseña", Toast.LENGTH_LONG).show();
                    ContraseñaRegistro.requestFocus();
                    return;

                }

                if (contraR.length() <= 5)
                {
                    Toast.makeText(Registro.this, "Debes usar un minimo de 6 caracteres en la contraseña", Toast.LENGTH_LONG).show();
                    ContraseñaRegistro.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(Eda))
                {
                    Toast.makeText(Registro.this, "Debes escribir una edad", Toast.LENGTH_LONG).show();
                    edad.requestFocus();
                    return;

                }
            }
        });
    }
}