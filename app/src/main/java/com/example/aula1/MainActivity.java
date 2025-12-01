package com.example.aula1;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    SQLiteDatabase bancoDados;
    EditText editText;
    Button buttonInserir;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Associando os componentes com váriaveis locais
        findViewById(R.id.editText);
        findViewById(R.id.buttonInserir);
        findViewById(R.id.listView);

        //Configura o banco
        bancoDados = openOrCreateDatabase("banco", MODE_PRIVATE, null);
        bancoDados.execSQL("CREATE TABLE IF NOT EXISTS notas (id INTEGER PRIMARY KEY AUTOINCREMENT, txt TEXT);");
        //this.listarNotas();

}}