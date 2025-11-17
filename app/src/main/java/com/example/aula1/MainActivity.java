package com.example.aula1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    int i=0;
    String [] nomes= new String[] {"Alvaro", "Ribeiro", "José", "Duda"};

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        lv= findViewById(R.id.listview);

        ArrayAdapter<String> a = new ArrayAdapter(
                this,
                R.layout.item_lista,
                R.layout.tex,
                  nomes);
        lv.setAdapter(a);
    }
}