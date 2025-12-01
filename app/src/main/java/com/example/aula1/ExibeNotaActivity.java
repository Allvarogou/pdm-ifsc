package com.example.aula1;


import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ExibeNotaActivity extends AppCompatActivity {   // Activity para editar ou excluir nota

    SQLiteDatabase bancoDados;                               // Referência ao banco
    TextView tvid;                                           // Exibe o ID da nota
    EditText editText;                                       // Campo para editar o texto
    Nota nota;                                               // A nota recebida da outra tela
    Button buttonUpdate, buttonDelete, buttonCancelar;        // Botões da interface

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

        // Associa componentes da tela
        tvid = findViewById(R.id.textViewId);
        editText = findViewById(R.id.edNota);
        buttonCancelar = findViewById(R.id.buttonCancelar);
        buttonDelete = findViewById(R.id.buttonDeletar);
        buttonUpdate = findViewById(R.id.buttonSalvar);

        // Abre o banco de dados
        bancoDados = openOrCreateDatabase("banco", MODE_PRIVATE, null);

        // Botão de cancelar (fecha a tela)
        buttonCancelar.setOnClickListener(view -> { finish(); });

        // Botão salvar (atualiza texto da nota)
        buttonUpdate.setOnClickListener((view -> {
            updateNota();                                     // Atualiza no banco
            Toast.makeText(this, "Nota atualizada", Toast.LENGTH_SHORT).show();
            finish();                                         // Fecha tela
        }));

        // Botão deletar
        buttonDelete.setOnClickListener((view -> {
            bancoDados.delete("notas", "id=?", new String[]{String.valueOf(nota.id)});  // Apaga do banco
            Toast.makeText(this, "Nota deletada", Toast.LENGTH_SHORT).show();
            finish();
        }));

        exibeNota(nota);                    // Mostra os dados na tela
    }

    public void exibeNota(Nota nota) {      // Preenche campos com a nota atual
        tvid.setText(String.valueOf(nota.id));
        editText.setText(nota.texto);
    }

    public void updateNota() {              // Atualiza texto no banco
        nota.texto = editText.getText().toString();     // Atualiza o objeto
        ContentValues cv = new ContentValues();
        cv.put("txt", nota.texto);                      // Envia novo texto ao banco
        bancoDados.update("notas", cv, "id=?", new String[]{String.valueOf(nota.id)});
    }
}
