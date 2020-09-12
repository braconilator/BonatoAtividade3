package br.usjt.ads.appHeroes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsHeroActivity extends AppCompatActivity {
    private TextView nome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_hero);
        nome = (TextView) findViewById(R.id.hero_display);
        Intent intent = getIntent();
        nome.setText(intent.getStringExtra(HeroesActivity.DESCRICAO));
    }
}