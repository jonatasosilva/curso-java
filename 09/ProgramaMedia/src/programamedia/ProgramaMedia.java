package programamedia;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float nota1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        float nota2 = teclado.nextFloat();
        float media = (nota1+nota2)/2;
        System.out.println("Sua média foi: " + media);
        if (media >= 9) {
            System.out.println("Parabéns!");
        }
    }
    
}
