package atividade3questao3for;

import java.util.Random;

public class Atividade3questao3for {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Números entre 1000 e 1999 que, quando divididos por 11, deixam resto 5:");

        for (int i = 0; i < 20; i++) {
            int numero = 1000 + random.nextInt(1000); // Gera números entre 1000 e 1999

            if (numero % 11 == 5) {
                System.out.println(numero);
            }
        }
    }
}