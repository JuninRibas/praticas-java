package listas01;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			Integer num = Integer.valueOf(s.nextLine());
			System.out.println(num);
		}
	}

}
