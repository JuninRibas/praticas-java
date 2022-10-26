package listas02;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {

		Float precoLitro = Float.valueOf(JOptionPane.showInputDialog("Digite o valor do preço"));
		Float quantidadedeLitros = Float.valueOf(JOptionPane.showInputDialog("Digite a quantidade de Litros"));
		Float totalPagamento = precoLitro * quantidadedeLitros;
		JOptionPane.showMessageDialog(null, "O total a pagar é: " + totalPagamento);

	}

}
