package listas01;

import java.nio.file.FileSystem;
import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Digite o preço do Litro");
		Float precoLitro = Float.valueOf(s.nextLine());
		System.out.println("Digite a quantidade de Litros");
		Float quantidadedeLitros = Float.valueOf(s.nextLine());

		Float total = calcTotal(precoLitro, quantidadedeLitros);
		System.out.println("O valor total a ser pago é: " + total);

	}

	private static Float calcTotal(Float precoLitro, Float quantidadedeLitros) {
		Float total = precoLitro * quantidadedeLitros;
		return total;
	}

}
