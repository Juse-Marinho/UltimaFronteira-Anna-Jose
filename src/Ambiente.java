import java.util.ArrayList;

public abstract class Ambiente {

    private int numero;
    private String nome;
    ArrayList<String> descricao = new ArrayList<String>();
    ArrayList<String> caminhos = new ArrayList<String>();

    public Ambiente(int x){
        numero = x;
    }
}
