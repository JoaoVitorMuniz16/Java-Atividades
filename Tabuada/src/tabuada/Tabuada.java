package tabuada;

public class Tabuada {

    public static void main(String[] args) {
        int numero = 5;
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + "x" + i + "-" + resultado);
        }
    }
    
}
