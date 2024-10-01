package atividade4questao1ifelse;

import java.util.Scanner;

public class Atividade4questao1ifelse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        double permissao = scanner.nextDouble();
        
        if (permissao >= 16) {
            System.out.println("Você já pode dirigir");
        } else {
            System.out.println("Você ainda não pode dirigir");
        }
        
        scanner.close();
    }
}

