package listas01;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o nome do aluno:");
		String nome = s.nextLine();
		System.out.println("Digite as 3 notas do aluno");
		Float nt1 = Float.valueOf(s.nextLine());
		Float nt2 = Float.valueOf(s.nextLine());
		Float nt3 = Float.valueOf(s.nextLine());

		Float MF = calcMedia(nt1, nt2, nt3);
		if (MF >= 6) {
			System.out.println("O aluno(a) " + nome + " está Aprovado(a): " + MF);
		}
		if (MF >= 4 && MF < 6) {
			System.out.println("O aluno(a) " + nome + " está em Recuperação: " + MF);
		}
		if (MF < 4) {
			System.out.println("O aluno(a) " + nome + " Reprovado(a)" + MF);
		}

	}

	private static Float calcMedia(Float nt1, Float nt2, Float nt3) {
		Float MF = (nt1 + nt2 + nt3) / 3;
		return MF;
	}

}
