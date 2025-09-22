package com.example.aula1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Button button;
    EditText Numero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        button =findViewById(R.id.button);
        Numero =findViewById(R.id.Numero);


        button.setOnClickListener(v -> {
            try {

                String numStr = Numero.getText().toString();

                if (numStr.isEmpty() ) {
                    System.out.println("Numero Invalido");
                    return;
                }


                Integer Nume = Integer.parseInt(numStr);

                Intent intent = new Intent(MainActivity.this, ResultadoTabuada.class);
                intent.putExtra("Numero", Nume);




                // 5. Inicia a tela de resultados.
                startActivity(intent);

            } catch (NumberFormatException e) {
                // Se a conversão falhar, exibe uma mensagem de erro.
                System.out.println("Erro");


            }
        });
    }
}