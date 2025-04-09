import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Personagem pessoa = new Personagem();
        Scanner scanner = new Scanner(System.in);

        if( pessoa.getxPos() == 0 && pessoa.getyPos() == 0 ){
            System.out.println("****************");
            System.out.println("\nMENU");
            System.out.println("Para começar digite o seu nome:");
            pessoa.setNome(scanner.next());
            String nome = pessoa.getNome();
            System.out.println("Essa é a história de " + nome + ". Seja bem-vindo!");
            System.out.println("\n****************");

            pessoa.setyPos(1);
            pessoa.setxPos(1);
        }

        while( (pessoa.getyPos() != 3) || (pessoa.getxPos() != 3)){
            System.out.println("\nVocê está na posição [" + pessoa.getxPos() +", "+ pessoa.getyPos() + "]. \nPara onde você quer andar?");
            System.out.println("(n)orte, (s)ul, (l)este, (o)este");
            pessoa.andar(scanner.next());
        }

    }
}