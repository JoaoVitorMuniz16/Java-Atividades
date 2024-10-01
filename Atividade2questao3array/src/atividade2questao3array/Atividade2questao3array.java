package atividade2questao3array;

public class Atividade2questao3array {

    public static void main(String[] args) {
        int[][][] matrizDeMatrizes = new int[3][3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    matrizDeMatrizes[i][j][k] = i * j * k;
                }
            }
        }

        System.out.println("Elemento na posição [1][2][1]: " + matrizDeMatrizes[1][2][1]);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.println("matrizDeMatrizes[" + i + "][" + j + "][" + k + "] = " + matrizDeMatrizes[i][j][k]);
                }
            }
        }
    }
}