import javax.swing.JOptionPane;

public class SomaDoisAula{
    public static void main(String[] args){
        // Declaração de variáveis
        double primeiroValor, segundoValor, resultado;
    
        // Entrada de dados
        // Pedir ao usuário para digitar dois números, atribuí-los as variáveis 

        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: ")); 
        segundoValor =  Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: ")); 
        

        // Processamento de dados 
        resultado = primeiroValor + segundoValor;

        // Saída de dados 
        JOptionPane.showMessageDialog(null, "A soma é: " + resultado);

    }
}
