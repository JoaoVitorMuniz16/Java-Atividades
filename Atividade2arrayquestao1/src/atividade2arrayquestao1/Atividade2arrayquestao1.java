package atividade2arrayquestao1;

public class Atividade2arrayquestao1 {

    public static void main(String[] args) {
        int[] vetorDobro = new int[10];
        
        for (int i = 0; i < 10; i++) {
            vetorDobro[i] = i * 2;
        }
        
        for (int i = 0; i < vetorDobro.length; i++) {
            System.out.print(vetorDobro[i] + " ");
        }
    }
}
