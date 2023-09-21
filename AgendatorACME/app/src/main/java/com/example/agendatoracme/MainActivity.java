package com.example.agendatoracme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AppCompatActivity.OnItemClickListener{

    private ListView lsvAgenda;
    private AdapterListView adapterListView;
    private ArrayList<ItemListView> view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lsvAgenda = (ListView) findViewById(R.id.lsvAgenda);

        lsvAgenda.setOnItemClickListener(this);
        CriarAgenda();
    }
    public void CriarAgenda(){
        Itens = new ArrayList<ItemListView>();

        ItemListView item1 = new ItemListView(R.drawable.foto1, "Juju");
        ItemListView item2 = new ItemListView(R.drawable.foto2, "Nicolas");
        ItemListView item3 = new ItemListView(R.drawable.foto3, "Kenner");
        ItemListView item4 = new ItemListView(R.drawable.foto4, "loira");
        ItemListView item5 = new ItemListView(R.drawable.foto5, "Ruiva");
        ItemListView item6 = new ItemListView(R.drawable.foto6, "Chuck");
        ItemListView item7 = new ItemListView(R.drawable.foto7, "Guilherme");

        Itens.add(Item1);
        Itens.add(Item2);
        Itens.add(Item3);
        Itens.add(Item4);
        Itens.add(Item5;
        Itens.add(Item6);
        Itens.add(Item7);

        AdapterListerView = new AdapterListView(this, Itens);

        lsvAgenda.setAdapter((ListAdapter) adapterListView);

        lsvAgenda.setCacheColorHint(color.TRANSPARENT);
    }

    @Override
    public void onItemClick(AdapterListView<?> adapterView, View view, int i, long l) {
        ItemListView item = (ItemListView) adapterView.getItem(i);

        Toast.makeText(this, "Contato Selecionado") + item.getNome().ToString(), Toast.LENGTH_LONG).show();
    }


}