import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		int valorUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		int valorDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

		JOptionPane.showMessageDialog(null, "O valor da soma é:" + (valorUm + valorDois));
	}
}
