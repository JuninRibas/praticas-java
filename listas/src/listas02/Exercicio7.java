package listas02;

import javax.swing.JOptionPane;

public class Exercicio7 {
	public static void main(String[] args) {

		Double nt1 = Double.valueOf(JOptionPane.showInputDialog("Digite a primeira nota"));
		Double nt2 = Double.valueOf(JOptionPane.showInputDialog("Digite a segunda nota"));
		Double nt3 = Double.valueOf(JOptionPane.showInputDialog("Digite a terceira nota"));

		Double MF = (nt1 + nt2 + nt3) / 3;
		if (MF >= 6) {
			JOptionPane.showMessageDialog(null, "Aprovado(a) " + MF);
		}
		if (MF >= 4 && MF < 6) {
			JOptionPane.showMessageDialog(null, "Recuperação " + MF);
		}
		if (MF < 4) {
			JOptionPane.showMessageDialog(null, "Reprovado(a) " + MF);
		}
	}

}
