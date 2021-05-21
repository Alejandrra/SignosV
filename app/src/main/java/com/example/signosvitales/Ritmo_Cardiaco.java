package com.example.signosvitales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ritmo_Cardiaco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Button Volver_Frecuencia_Cardiaca;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ritmo__cardiaco);


        Volver_Frecuencia_Cardiaca = (Button) findViewById(R.id.btnvolverR_C);
        Volver_Frecuencia_Cardiaca.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v)
            {
                Intent Volver_Frecuencia_Cardiaca = new Intent(Ritmo_Cardiaco.this, Menu_Principal.class);
                startActivity(Volver_Frecuencia_Cardiaca);
            }
        });
    }
}