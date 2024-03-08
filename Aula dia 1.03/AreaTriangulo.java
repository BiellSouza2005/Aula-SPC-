
import javax.swing.JOptionPane;
    public class AreaTriangulo {
        public static void main(String [] args){
    
        //Variáveis
        double base, altura, area;

        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
        
        area = (base * altura) / 2;

        JOptionPane.showMessageDialog(null, "Valor da área é: " + area);


    }
}

