package com.example.agendatoracme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterListView extends BaseAdapter {

    private LayoutInflater mInflater;
    private ArrayList<ItemListView> Itens;

    public AdapterListView(Context context, ArrayList<ItemListView> Itens){
        this.Itens = Itens;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return Itens.size();
    }

    @Override
    public Object getItem(int value) {
        return Itens.get(value);
    }

    @Override
    public long getItemId(int value) {
        return value;
    }

    @Override
    public View getView(int value, View view, ViewGroup viewGroup) {

        ItemListView item = Itens.get(value);
        view = mInflater.inflate(R.layout.item_listview, null);

        ((TextView)view.findViewById(R.id.txtNome)).setText(item.getNome());
        ((ImageView)view.findViewById(R.id.imgFoto)).setImageResource(item.getFoto());

        return view;

    }
}
