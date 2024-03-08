import javax.swing.JOptionPane;
    public class IdadeDias {
        public static void main(String [] args){
    
        //Variáveis
        double idadeAno, idadeDias;

        idadeAno = Double.parseDouble(JOptionPane.showInputDialog("Digite a idade de uma pessoa em anos: "));
        
        idadeDias =     idadeAno * 365;

        JOptionPane.showMessageDialog(null, "Idade em dias dessa pessoa é: " + idadeDias);


    }
}

