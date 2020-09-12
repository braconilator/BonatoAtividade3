package br.usjt.ads.appHeroes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtNome;
    public static final String NOME = "br.usjt.ads20.appHeroes.nome";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNome = (EditText)findViewById(R.id.buscar);
    }

    public void buscarHerois(View view) {
        String nome = txtNome.getText().toString();
        Intent intent = new Intent(this, HeroesActivity.class);
        intent.putExtra(NOME, nome);
        startActivity(intent);
    }
}