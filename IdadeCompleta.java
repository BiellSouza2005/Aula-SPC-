import javax.swing.JOptionPane;
public class IdadeCompleta {
        public static void main(String [] args){
    
        //Variáveis
        int idadeAnos, idadeMeses, idadeDias, idadeTotal;
        JOptionPane.showMessageDialog(null,"Coloque a idade da pessoa com os valores respectivos: anos, meses e dias desde o nascimento: ");

        idadeAnos = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa em anos: "));
        idadeMeses = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos meses que já se passaram este ano: "));
        idadeDias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias que já passarma neste mês: "));
        
        idadeTotal = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;

        JOptionPane.showMessageDialog(null, "Idade em dias dessa pessoa é: " + idadeTotal);


    }
}

