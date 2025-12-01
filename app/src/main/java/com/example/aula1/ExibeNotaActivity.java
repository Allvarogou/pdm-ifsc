package com.example.aula1;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ExibeNotaActivity {
SQLiteDatabase bancoDados;
TextView editText;
Nota nota;
Button buttonUpdate, buttonDelete, buttonCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {     // Inicialização da Activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe_nota);

        // Recebe os dados enviados pela MainActivity
        Bundle b = getIntent().getExtras();
        if (b.containsKey("nota")) {                         // Verifica se veio uma Nota
            nota = (Nota) b.getSerializable("nota");
        } else {
            Toast.makeText(this, "Nota vazia", Toast.LENGTH_SHORT).show();
            finish();
        }

        tvid = findById


}}
