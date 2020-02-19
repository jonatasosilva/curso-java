package contator01;

public class Contator01 {

    public static void main(String[] args) {
        int c = 0;
        while (c<10) {
            c++;
            if (c==2 || c==3 || c==4) {
                continue;
            }
            if (c==7) {
                break;
            }
            System.out.println("Cambalhota " + c);
        }
    }
    
}
