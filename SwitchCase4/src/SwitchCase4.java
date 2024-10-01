import java.util.Scanner;

public class SwitchCase4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha um número entre 1 a 5");
        int numero = entrada.nextInt();
        switch (numero) {
            case 1:
                System.out.println("O número escolhido foi: 1.");
                break;
            case 2:
                System.out.println("O número escolhido foi: 2.");
                break;
            case 3:
                System.out.println("O número escolhido foi: 3.");
                break;
            case 4:
                System.out.println("O número escolhido foi: 4.");
                break;
            case 5:
                System.out.println("O número escolhido foi: 5.");
                break;
            default:
                System.out.println("O número escolhido é inválido! Digite um numero entre 1 a 5");
        }
    }
    
}
