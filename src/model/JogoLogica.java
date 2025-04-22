package model;

import java.util.Scanner;

public class JogoLogica {

    Scanner scanner = new Scanner(System.in);
    public JogoLogica(){
    }

    public void menu(){
        if( Objetos.pessoa.getxPos() == 0 && Objetos.pessoa.getyPos() == 0 ) {
            System.out.println("****************");
            System.out.println("\nMENU");
            System.out.println("Para começar digite o seu nome:");
            Objetos.pessoa.setNome(scanner.next());
            String nome = Objetos.pessoa.getNome();
            System.out.println("Essa é a história de " + nome + ". Seja bem-vindo!");
            System.out.println("\n****************");

            Objetos.pessoa.setyPos(1);
            Objetos.pessoa.setxPos(1);
        }
    }

    public void esperarComando(){

        for( int horas = 8; horas <= 22; horas++){
            System.out.println("O que você deseja fazer?");
            String com = scanner.next();

            switch (com) {
                case "andar" -> {
                    System.out.println("\nPara onde você quer andar? (n)orte, (s)ul, (l)este, (o)este");
                    Objetos.pessoa.andar(scanner.next());
                    horas = horas + 5;
                    System.out.println("\nVocê está na posição [" + Objetos.pessoa.getxPos() +", "+ Objetos.pessoa.getyPos() + "].");
                }
                case "ver_inventario" -> Objetos.pessoa.verInventario();
                case "adicionar_item" -> Objetos.pessoa.adicionarItem(Objetos.berry);
            }
        }
    }

}
