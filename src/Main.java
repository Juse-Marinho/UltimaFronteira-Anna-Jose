import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Personagem pessoa = new Personagem();

        if(pessoa.getSala() == 0){
            System.out.println("****************");
            System.out.println("\nMENU");
            System.out.println("Para começar digite o seu nome:");
            Scanner scanner = new Scanner(System.in);
            pessoa.setNome(scanner.next());
            String nome = pessoa.getNome();
            System.out.println("Essa é a história de " + nome + ". Seja bem-vindo!");
            System.out.println("\n****************");
        }



    }
}