import javax.swing.JOptionPane;
public class Comissão {
    public static void main(String [] args){
    
        //Variáveis
        double peça, unidade, comissão;

        peça = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da peça: "));
        unidade = Double.parseDouble(JOptionPane.showInputDialog("Digite quantas foram vendidas: "));

        comissão = (peça * unidade) * 0.05;

        JOptionPane.showMessageDialog(null, "Valor da comissão é igual a: " + comissão);


    }
}
