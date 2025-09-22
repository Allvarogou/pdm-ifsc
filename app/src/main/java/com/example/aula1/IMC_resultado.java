package com.example.aula1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IMC_resultado extends AppCompatActivity {

    // Declaração de variáveis para os TextViews.
    // tvResultado para o valor do IMC e tvClassificacao para a mensagem.
    private TextView tvResultado;
    private TextView tvClassificacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Define o layout da tela de resultados.
        setContentView(R.layout.activity_imc_resultado);

        // Vincula as variáveis aos componentes do layout usando seus IDs.
        tvResultado = findViewById(R.id.tvResultado);
        tvClassificacao = findViewById(R.id.tvClassificacao);

        // Pega o Intent que iniciou esta Activity.
        Intent intent = getIntent();

        // Extrai os dados de peso e altura do Intent.
        double peso = intent.getDoubleExtra("peso", 0);
        double altura = intent.getDoubleExtra("altura", 0);

        // Converte a altura (que está em cm) para metros para o cálculo.
        double alturaEmMetros = altura / 100.0;

        // Calcula o IMC usando a fórmula.
        double imc = peso / (alturaEmMetros * alturaEmMetros);

        // Formata o valor do IMC para ter apenas duas casas decimais.
        String imcFormatado = String.format("%.2f", imc);

        // Define o texto do tvResultado com o valor calculado.
        tvResultado.setText(imcFormatado);

        // Define uma mensagem de classificação baseada no valor do IMC.
        String mensagemClassificacao;
        if (imc < 18.5) {
            mensagemClassificacao = "Você está abaixo do peso ideal.";
        } else if (imc < 24.9) {
            mensagemClassificacao = "Parabéns! Você está no peso ideal.";
        } else if (imc < 29.9) {
            mensagemClassificacao = "Você está com sobrepeso.";
        } else {
            mensagemClassificacao = "Você está com obesidade.";
        }

        // Define o texto do tvClassificacao com a mensagem correta.
        tvClassificacao.setText(mensagemClassificacao);
    }
}