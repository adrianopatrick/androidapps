package br.alura.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        Button btSalvar = (Button) findViewById(R.id.formulario_salvar);
            btSalvar.setOnClickListener(v -> {Toast.makeText(FormularioActivity.this,
                "Aluno salvo com sucesso!", Toast.LENGTH_SHORT).show();
                finish();
        });
    }
}
