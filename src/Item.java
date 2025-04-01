public abstract class Item {

    private final String nome;
    private final int peso;
    private final int durabilidade;

    public Item(String nome, int peso, int durabilidade){
        this.nome = nome;
        this.peso = peso;
        this.durabilidade = durabilidade;
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
