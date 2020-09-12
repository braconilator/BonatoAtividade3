package br.usjt.ads.appHeroes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HeroesActivity extends AppCompatActivity {
    public static final String DESCRICAO = "br.usjt.ads20.appHeroes.descricao";
    ArrayList<String> lista;
    Activity atividade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);
        atividade = this;
        Intent intent = getIntent();
        String chave = intent.getStringExtra(MainActivity.NOME);
        lista = invokeHeroes(chave);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, lista);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent1 = new Intent(atividade, DetailsHeroActivity.class);
                intent1.putExtra(DESCRICAO, lista.get(i));
                startActivity(intent1);
            }
        });
    }

    private ArrayList<String> invokeHeroes(String chave){
        ArrayList<String> lista = listHeroes();
        if(chave == null || chave.length() == 0){
            return lista;
        } else {
            ArrayList<String> filtro = new ArrayList<>();
            for(String nome: lista){
                if(nome.toUpperCase().contains(chave.toUpperCase())){
                    filtro.add(nome);
                }
            }
            return filtro;
        }
    }
    private ArrayList<String> listHeroes(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Black Widow");
        lista.add("Blackheart");
        lista.add("Cable");
        lista.add("Chimera");
        lista.add("Spider Man");
        lista.add("Crossbones");
        lista.add("Hawkeye");
        lista.add("Red Wolf");
        lista.add("Roulette");
        lista.add("Thor Girl");
        lista.add("Thing");
        lista.add("Supernaut");
        lista.add("Skin");
        lista.add("Starfox");
        lista.add("Screwball");
        lista.add("Toad");
        return lista;
    }
}