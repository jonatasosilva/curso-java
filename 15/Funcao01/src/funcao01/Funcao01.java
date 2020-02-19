package funcao01;

import java.util.Scanner;

public class Funcao01 {

    public static void main(String[] args) {
        Fatorial f = new Fatorial();
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = teclado.nextInt();
        f.setValor(num);
        System.out.println(f.getFormula() + f.getFatorial());
    }
    
}
