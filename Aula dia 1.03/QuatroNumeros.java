import javax.swing.JOptionPane;
public class QuatroNumeros {
    public static void main (String [] args){
        //Variáveis
        double N1, N2, N3, N4, soma;

        //Entrada
        N1= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        N2= Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
        N3= Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número: "));
        N4= Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número: "));

        soma = N1 * N1 + N2 * N2 + N3 * N3 + N4 * N4;

        JOptionPane.showMessageDialog(null, "O resultado da soma dos quadrados dos valores informados é: " + soma);


        
    }

}
