package atividade4questao3ifelse;

import java.util.Scanner;

public class Atividade4questao3ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (entre 0.00 e 10.0): ");
        float nota = scanner.nextFloat();

        if (nota < 0.0 || nota > 10.0) {
            System.out.println("Nota inválida. Digite uma nota entre 0.00 e 10.0.");
        } else if (nota < 6.0) {
            System.out.println("Nota: F");
        } else if (nota < 7.0) {
            System.out.println("Nota: D");
        } else if (nota < 8.0) {
            System.out.println("Nota: C");
        } else if (nota < 9.0) {
            System.out.println("Nota: B");
        } else {
            System.out.println("Nota: A");
        }

        scanner.close();
    }
}
