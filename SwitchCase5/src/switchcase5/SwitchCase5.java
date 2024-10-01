package switchcase5;

import java.util.Scanner;

public class SwitchCase5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha um numero entre 1 a 5");
        int numero = entrada.nextInt();
        switch (numero) {
            case 1 -> System.out.println("O número escolhido foi 1.");
            case 2 -> System.out.println("O número escolhido foi 2.");
            case 3 -> System.out.println("O número escolhido foi 3.");
            case 4 -> System.out.println("O número escolhido foi 4.");
            case 5 -> System.out.println("O número escolhido foi 5.");
            default -> System.out.println("O número escolhido é inválido! Digite um número entre 1 a 5.");
        }
    }
    
}
