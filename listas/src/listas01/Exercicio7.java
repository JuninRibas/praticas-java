package listas01;

public class Exercicio7 {
	public static void main(String[] args) {
		String[] vet = new String[10];
		vet[0] = "1";
		vet[1] = "2";
		vet[2] = "3";
		vet[3] = "4";
		vet[4] = "5";
		vet[5] = "6";
		vet[6] = "7";
		vet[7] = "8";
		vet[8] = "9";
		vet[9] = "10";
		for (int i = 0; i < vet.length; i++) {
			System.out.println("O valor do vetor na posição " + i + " é " + vet[i]);
		}
		System.out.println("O ultimo elemento do vetor é: " + vet[vet.length - 1]);
	}

}
