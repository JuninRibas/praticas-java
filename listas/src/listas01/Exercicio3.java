package listas01;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um número");
		Integer num = Integer.valueOf(s.nextLine());
		if (num % 2 == 0) {
			System.out.println(num + " é par");
		} else {
			System.out.println(num + " é impar");
		}
	}

}
