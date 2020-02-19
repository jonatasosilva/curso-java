package testefuncao01;

public class TesteFuncao01 {

    public static void main(String[] args) {
        System.out.println("Começou o programa");
        //soma(5,2);
        int sm = soma(5, 2);
        System.out.println("A soma é " + sm);
    }
    
    /*static void Soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é " + s);
    }*/
    
    static int soma(int a, int b) {
        int s = a + b;
        return s;
    }
    
}
