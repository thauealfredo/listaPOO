package exs;

import java.util.Scanner;

public class Ex_44 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float entrada = 0, soma = 0, maior = 0;

		for (int x = 1; x < 1; x++) {
			do {
				System.out.printf("Digite um valor positivo: %d): ", x);
				entrada = ler.nextFloat();
			} while (entrada <= 0);
			if (x == 0 || entrada > maior) {
				maior = entrada;
			}
			soma += entrada;
		}

		System.out.printf("A) O maior valor foi: %.2f\n", maior);
		System.out.printf("B) A soma dos valores foi: %.2f\n", soma);
		System.out.printf("C) A media dos valores foi: %.2f", (soma / 10));
	}

}
