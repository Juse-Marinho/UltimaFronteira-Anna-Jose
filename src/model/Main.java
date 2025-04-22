package model;

import java.util.Scanner;

public class Main {
    static JogoLogica logica = new JogoLogica();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        logica.menu();

        System.out.println("\nVocê está na posição [" + Objetos.pessoa.getxPos() +", "+ Objetos.pessoa.getyPos() + "].");

        while( (Objetos.pessoa.getyPos() != 3) || (Objetos.pessoa.getxPos() != 3)){

            logica.esperarComando();

        }

        System.out.println("Você chegou em segurança.");

    }
}