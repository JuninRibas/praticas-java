package listas02;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			
			Integer num = Integer.valueOf(JOptionPane.showInputDialog("Digite 10 numeros"));
			JOptionPane.showInternalMessageDialog(null, num);
			
		}
	}

}
