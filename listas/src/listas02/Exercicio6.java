package listas02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			lista.add(JOptionPane.showInputDialog("Digite 10 nomes"));

		}
		JOptionPane.showMessageDialog(null, lista);

	}

}
