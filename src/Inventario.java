import java.util.ArrayList;

public class Inventario {

    ArrayList<Item> itens = new ArrayList<Item>();

    public Inventario(ArrayList<Item> itens){
        this.itens = itens;
    }

    public void adicionarItem(Item item){
        itens.add(item);
    }

}
