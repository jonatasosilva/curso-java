package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        System.out.print("Em que ano você nasceu? ");
        Scanner teclado = new Scanner(System.in);
        int ano = teclado.nextInt();
        int idade = 2019 - ano;
        System.out.print("Sua idade é " + idade);
        if (idade >= 18) {
            System.out.println(" e você é maior de idade");
        } else {
            System.out.println(" e você é menor de idade");
        }
    }
    
}
