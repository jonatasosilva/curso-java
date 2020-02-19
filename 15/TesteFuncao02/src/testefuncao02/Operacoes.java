package testefuncao02;

public class Operacoes {
    
    public static String contador(int a, int b) {
        String s = "";
        for (int c = a; c<= b; c++) {
            s += c + " ";
        }
        return s;
    }
    
}
