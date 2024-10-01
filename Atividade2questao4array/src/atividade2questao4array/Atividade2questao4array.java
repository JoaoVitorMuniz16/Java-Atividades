package atividade2questao4array;

import java.util.Random;

public class Atividade2questao4array {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Random random = new Random();

        int maior = Integer.MIN_VALUE;
        int linhaMaior = -1;
        int colunaMaior = -1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(100); // Números aleatórios entre 0 e 99
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("Matriz gerada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMaior número da matriz: " + maior);
        System.out.println("Posição: [" + linhaMaior + "][" + colunaMaior + "]");
    }
}