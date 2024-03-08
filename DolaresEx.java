import javax.swing.JOptionPane;

public class DolaresEx {
    public static void main(String[] args) {
        // Declaração variáveis
        double dolares, real, resultado;
        dolares = 4.95;

        // Entrada de dados
        real = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dólares: "));
        resultado = real * dolares;
        // Saída
        JOptionPane.showMessageDialog(null, "O valor em reais é: " + resultado);
    }

}
