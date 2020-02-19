package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Olá, mundo!", "Boas vindas", JOptionPane.INFORMATION_MESSAGE);
        int n, soma=0, pares=0, impares=0, acima=0;
        float total = 0f, media = 0f;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número:<br>(valor 0 interrompe)</html>"));
            if (n % 2 == 0 && n != 0) {
                pares++;
            } else if (n != 0) {
                impares++;
            }
            if (n > 100) {
                acima++;
            }
            if (n != 0) {
                total++;
            }
            soma += n;
            media = soma / total;
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado:<hr/>"
                + "<br/>Total de valores: " + total
                + "<br/>Total de Pares: " + pares
                + "<br/>Total de Ímpares: " + impares
                + "<br/>Acima de 100: " + acima
                + "<br/>Média dos valores: " + media 
                + "</html>");
    }
    
}
