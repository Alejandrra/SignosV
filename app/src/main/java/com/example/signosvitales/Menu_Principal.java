package com.example.signosvitales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_Principal extends AppCompatActivity {

    Button Temperatura;
    Button FrecuenciaC;
    Button SaturacionO;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        Temperatura = (Button) findViewById(R.id.btnTemperatura);
        Temperatura.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent Temperatura = new Intent(Menu_Principal.this, Temperatura.class);
                startActivity(Temperatura);
            }
        });

        FrecuenciaC = (Button) findViewById(R.id.btnRitmoCardiaco);
        FrecuenciaC.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent FrecuenciaC = new Intent(Menu_Principal.this, Ritmo_Cardiaco.class);
                startActivity(FrecuenciaC);
            }
        });

        SaturacionO = (Button) findViewById(R.id.btnNivelOxigeno);
        SaturacionO.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent SaturacionO = new Intent(Menu_Principal.this, Nivel_Oxigeno.class);
                startActivity(SaturacionO);
            }
        });

    }
}