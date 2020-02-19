package numeros;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String res;
        int n = 0, s = 0;
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s += n;
            System.out.println("Deseja continuar? [S/N]");
            res = teclado.next();
        } while (res.equals("s"));
        System.out.println("A soma de todos os números é: " + s);
    }
    
}
