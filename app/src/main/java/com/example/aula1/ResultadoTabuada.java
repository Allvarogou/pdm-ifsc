package com.example.aula1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoTabuada extends AppCompatActivity {

 private TextView TvResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_tabuada);
        TvResultado = findViewById(R.id.tvResultado);

        Intent intent = getIntent();

        Integer Nume = intent.getIntExtra("Nume", 0);

        int taboada;

// Limpe a TextView antes de iniciar o laço
        TvResultado.setText("");

        for (int i = 1; i < 11; i++) {
            taboada = Nume * i;
            String textoAtual = TvResultado.getText().toString();
            // Adicione o novo resultado ao texto existente
            TvResultado.setText(textoAtual + "\n" + Nume + " x " + i + " = " + taboada);
        }





}}