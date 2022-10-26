package listas02;

import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {
		Integer[] vet = new Integer[10];
		Integer maior = Integer.MIN_VALUE;
		Integer menor = Integer.MAX_VALUE;
		for (int i = 0; i < vet.length; i++) {
			vet[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite 10 números"));
			if (vet[i] > maior) {
				maior = vet[i];
			}
			if (vet[i] < menor) {
				menor = vet[i];
			}
		}
		JOptionPane.showMessageDialog(null, "O maior número é: " + maior + " e o menor número é: " + menor);
	}

}
