import javax.swing.JOptionPane;



public class PodeDirigir {

    public static void primeiraForma(int idade, String podeDirigir) {
        if(idade >= 18) 
        {
            podeDirigir = "Sim, você pode!";
        }
        else
        {
            podeDirigir = "NÃO PODE DIGIRIR!!!";
        }
    
        JOptionPane.showMessageDialog(null, podeDirigir);
    }
    
    public static void segundaForma(int idade, String podeDirigir){
        podeDirigir = idade >= 18 ? "Sim, você pode!" : "Não!";

        JOptionPane.showMessageDialog(null, podeDirigir);
    }
    public static void main(String [] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

        String podeDirigir = "";
        
        //primeiraForma(idade, podeDirigir);
        segundaForma(idade, podeDirigir);
    }
}
