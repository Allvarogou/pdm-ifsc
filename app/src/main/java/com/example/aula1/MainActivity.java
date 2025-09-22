package com.example.aula1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declaração das variáveis para os componentes da interface.
    // edPeso e edAltura são nomes de variáveis, mas seus IDs no XML são diferentes.
    private Button btCalcular;
    private EditText edPeso, edAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Define o layout da tela principal.
        setContentView(R.layout.activity_main);

        // Vincula as variáveis aos componentes do layout usando seus IDs.
        // O nome dentro de findViewById() deve corresponder exatamente ao ID no XML.
        btCalcular = findViewById(R.id.btCalcular);
        edPeso = findViewById(R.id.PesoCalc);
        edAltura = findViewById(R.id.AlturaCalc);

        // Define a ação de clique do botão "Calcular".
        btCalcular.setOnClickListener(v -> {
            try {
                // Pega o texto dos campos de entrada.
                String pesoStr = edPeso.getText().toString();
                String alturaStr = edAltura.getText().toString();

                // 1. Validação de campos vazios para evitar erro NaN.
                if (pesoStr.isEmpty() || alturaStr.isEmpty()) {
                    Toast.makeText(this, "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT).show();
                    return;
                }

                // 2. Converte o texto para números (Double).
                // Um bloco try-catch é usado para tratar erros se o usuário digitar letras.
                Double peso = Double.parseDouble(pesoStr);
                Double altura = Double.parseDouble(alturaStr);

                // 3. Cria um Intent para iniciar a tela de resultados.
                Intent intent = new Intent(MainActivity.this, IMC_resultado.class);

                // 4. Anexa os valores de peso e altura ao Intent para passá-los para a próxima tela.
                intent.putExtra("peso", peso);
                intent.putExtra("altura", altura);

                // 5. Inicia a tela de resultados.
                startActivity(intent);

            } catch (NumberFormatException e) {
                // Se a conversão falhar, exibe uma mensagem de erro.
                Toast.makeText(this, "Por favor, digite apenas números válidos.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}