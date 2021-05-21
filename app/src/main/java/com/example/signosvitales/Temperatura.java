package com.example.signosvitales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Temperatura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Button Volver_Temperatura;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        Volver_Temperatura = (Button) findViewById(R.id.btnvolverTem);
        Volver_Temperatura.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v)
            {
                Intent Volver_Temperatura = new Intent(Temperatura.this, Menu_Principal.class);
                startActivity(Volver_Temperatura);
            }
        });

    }
}