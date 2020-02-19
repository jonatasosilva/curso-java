package vetor05;

import java.util.Arrays;

public class Vetor05 {

    public static void main(String[] args) {
       int vet[] = new int[5];
       Arrays.fill(vet, 7);
       for (int valor: vet) {
           System.out.println(valor);
       }
    }
    
}
