package listas01;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Integer[] vet = new Integer[10];
		Integer maior = Integer.MIN_VALUE;
		Integer menor = Integer.MAX_VALUE;

		System.out.println("Digite 10 números");

		for (int i = 0; i < vet.length; i++) {
			vet[i] = s.nextInt();
			if (vet[i] > maior) {
				maior = vet[i];
			}
			if (vet[i] < menor) {
				menor = vet[i];
			}
		}
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);

	}
}
