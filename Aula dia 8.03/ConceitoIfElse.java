import javax.swing.JOptionPane;

public class ConceitoIfElse {
    public static void ifSimples(double nota) {
     
        //Condição

        if(nota >=  70) 
        {
            JOptionPane.showMessageDialog(null, "Você foi aprovado!", "Resultado", 1);
        }

    }    

    public static void ifElseSimples(double nota) {
        
        //Condição
        if(nota >=  70) 
        {
            JOptionPane.showMessageDialog(null, "Você foi aprovado!", "Resultado", 1);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Você foi reprovado!", "Resultado", 0);
        }

    }

    public static void ifElseEncadeado(double nota) {
    
        //Condição
        if(nota >=  90) 
        {
            JOptionPane.showMessageDialog(null, "Conceito A", "Resultado", 1);
        }
        else if(nota >= 80)
        {
            JOptionPane.showMessageDialog(null, "Conceito B", "Resultado", 1);
        }
        else if(nota >= 70)
        {
            JOptionPane.showMessageDialog(null, "Conceito C", "Resultado", 1);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Você foi reprovado!", "Resultado", 0);
        }

    }
    public static void main (String[] args) {
        
        // Declaração da variável
        double nota;

        // Entrada de  dados
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota: "));


        //Para testar cada uma das funções do if else, basta comentar o método já utilizado e descomentar o desejado!

        //ifSimples(nota);
        //ifElseSimples(nota);
        ifElseEncadeado(nota);
    }


  
}
