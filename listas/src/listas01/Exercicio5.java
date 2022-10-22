package listas01;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Integer num = Integer.valueOf(s.nextLine());
		while (num <= 99) {
			System.out.println(num);
			num++;
		}
	}

}
