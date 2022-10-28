package com.example.ejercicio12_ingresardatos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class DatosResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_resultado);

        TextView tv5 = (TextView)findViewById(R.id.txt_resultado);
        String dato = getIntent().getStringExtra("Resultado");
        tv5.setText("" + dato);
    }
}