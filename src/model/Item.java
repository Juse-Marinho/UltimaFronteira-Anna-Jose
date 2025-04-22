package model;

public class Item {

    private final String nome;
    private int peso;
    private int durabilidade;

    public Item(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getPeso() {
        return peso;
    }

    public int getDurabilidade() {
        return durabilidade;
    }
}
