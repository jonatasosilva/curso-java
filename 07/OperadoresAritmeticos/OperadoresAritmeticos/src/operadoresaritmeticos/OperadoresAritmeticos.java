package operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        //Operadores Aritmeticos
        /*
         *int n1 = 5;
         *int n2 = 3;
         *float m = (n1+n2)/2;
         *System.out.println("A média é: " + m);
        */
        
        //Operadores Unarios
        /*
         *int numero = 5;
         *int valor = 5 + ++numero;
         *System.out.println(valor);
         *System.out.println(numero);
        */
        
        //Operadores de Atribuição
        /*int x = 4;
         *x += 2;
         *System.out.println(x);
        */
        
        // Classes Math
        /*double pi = Math.PI;
         *System.out.println("O número PI é: " + pi);
         *double exp = Math.pow(5, 2);
         *System.out.println("5 elevado a 2 é: " + exp);
         *double raizQ = Math.sqrt(25);
         *System.out.println("A raiz quadrada de 25 é: " + raizQ);
         *double raizC = Math.cbrt(27);
         *System.out.println("A raiz cubica de 27 é: " + raizC);
         *int abslt = Math.abs(-10);
         *System.out.println("O valor absoluto de -10 é: " + abslt);
         *float arbaixo = (float) Math.floor(3.9);
         *System.out.println("O arrendodamento de 3.9 para baixo é: " + arbaixo);
         *float arcima = (float) Math.ceil(3.2);
         *System.out.println("O arrendodamento de 3.2 para cima é: " + arcima);
         *double ar = Math.round(3.6);
         *System.out.println("O arrendodamento de 3.6 é: " + ar);
        */
        
        //Gerador de Numeros
        int ale = (int) (5 + Math.random() * (10-5));
        System.out.println(ale);
    }
    
}
