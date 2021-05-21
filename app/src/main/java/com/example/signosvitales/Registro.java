package com.example.signosvitales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity
{
    Button Volver;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Volver = (Button) findViewById(R.id.btnvolver);
        Volver.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent Volver = new Intent(Registro.this, MainActivity.class);
                startActivity(Volver);
            }
        });
    }
}