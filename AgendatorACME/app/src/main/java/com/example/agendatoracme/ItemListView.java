package com.example.agendatoracme;

public class ItemListView {
    private int Foto;
    private String Nome;

    /*Métodos get e set*/
    public ItemListView(int foto, String nome) {
        Foto = foto;
        Nome = nome;
    }

    public int getFoto() {
        return Foto;
    }
    public void setFoto(int foto) {
        Foto = foto;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
}
