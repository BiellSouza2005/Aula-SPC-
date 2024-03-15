import javax.swing.JOptionPane;

public class SwitchCase {

    public static void main(String [] args) {

        int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite sua nota: "));

        switch (nota) {
            case 10:
                JOptionPane.showMessageDialog(null, "Aprovado! Conceito A");
                
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Aprovado! Conceito B!");
            
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Aprovado! Conceito C");
        
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Aprovado! Conceito D");
    
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Aprovado! Conceito E");
    
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "REPROVADO");
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "REPROVADO");
                break;
        }
    }
}