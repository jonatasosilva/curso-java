package vetor04;

import java.util.Arrays;

public class Vetor04 {

    public static void main(String[] args) {
        int v[] = {1, 4, 5, 7, 9};
        for (int valor: v) {
            System.out.print(valor + " ");
        }
        System.out.println("");
        Arrays.sort(v);
        int p = Arrays.binarySearch(v, 7);
        System.out.println("Encontrei o valor na posição " + p);
    }
    
}
