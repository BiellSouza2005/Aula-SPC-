
import javax.swing.JOptionPane;
    public class ValorAnterior {
        public static void main(String [] args){
    
        //Variáveis
        double valorInserido, valorAnterior;

        valorInserido = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        
        valorAnterior = valorInserido - 1;

        JOptionPane.showMessageDialog(null, "Valor anterior é: " + valorAnterior);


    }
}

