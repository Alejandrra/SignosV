package com.example.signosvitales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nivel_Oxigeno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Button Volver_Nivel_Oxigeno;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel__oxigeno);

        Volver_Nivel_Oxigeno = (Button) findViewById(R.id.btnN_O);
        Volver_Nivel_Oxigeno.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v)
            {
                Intent Volver_Nivel_Oxigeno = new Intent(Nivel_Oxigeno.this, Menu_Principal.class);
                startActivity(Volver_Nivel_Oxigeno);
            }
        });
    }
}