package model;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Item> itens;
    private int espacoAtual = 20;

    public Inventario(){
        itens = new ArrayList<Item>();
    }

    public void adicionarItem(Item item){
        if (espacoAtual > 0){
            itens.add(item);
            espacoAtual -= 1;
        }
        else{
            System.out.println("Sem espaço");
        }
    }

    public void listarItens(){
        for (Item item : itens) {
            System.out.println(item.getNome());
        }
    }

    public int getEspacoAtual(){
        return espacoAtual;
    }
}
