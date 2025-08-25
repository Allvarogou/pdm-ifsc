package com.example.aula1;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.d("Ciclo_vida", "onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Ciclo_vida", "osStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Ciclo_vida", "osResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Ciclo_vida", "osPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Ciclo_vida", "osStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Ciclo_vida", "osRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Ciclo_vida", "osDestroy");
    }


}