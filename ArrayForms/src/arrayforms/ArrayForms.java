package arrayforms;

public class ArrayForms {

    public static void main(String[] args) {
        int[] a = new int[4];
        int[] b;
        b = new int[10];
        
//Declarando mais de um array por vez:
        int[] r = new int[44], k = new int[23];
        
//Incializando valores do array:
        int[] inicia_valores = {2, 52, 504, 7, 88, 9, 6, 14, 666,};
        
//Declarando array tipo interger (números inteiros:)
        int[] array_exemplo_N_inteiro;
        
// Definido 9 posições para nossos números e inicializando cada elemento:
        array_exemplo_N_inteiro = new int[9];
        array_exemplo_N_inteiro[0] = 100;
        array_exemplo_N_inteiro[1] = 85;
        array_exemplo_N_inteiro[2] = 88;
        array_exemplo_N_inteiro[3] = 93;
        array_exemplo_N_inteiro[4] = 123;
        array_exemplo_N_inteiro[5] = 952;
        array_exemplo_N_inteiro[6] = 344;
        array_exemplo_N_inteiro[7] = 233;
        array_exemplo_N_inteiro[8] = 622;
        
//imprimir no console as posições 8 e 4:
        System.out.println(array_exemplo_N_inteiro[8]);
        System.out.println(array_exemplo_N_inteiro[4]);
    }
    
}
