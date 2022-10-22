package listas01;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um nome e a idade de uma pessoa:");
		String nome = s.nextLine();
		Integer idade = Integer.valueOf(s.nextLine());
		System.out.println("O nome dele(a) é " + nome + " e sua idade é de " + idade + " anos");
	}

}
