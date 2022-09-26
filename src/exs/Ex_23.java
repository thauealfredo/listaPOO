package exs;

import java.util.Scanner;

public class Ex_23 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double a, b, c, soma;

		System.out.printf("Digite o valor de A: ");
		a = ler.nextDouble();

		System.out.printf("Digite o valor de B: ");
		b = ler.nextDouble();

		System.out.printf("Digite o valor de C: ");
		c = ler.nextDouble();

		soma = a + b;

		if (c < soma)
			System.out.printf("A soma de A + B é igual a %.2f e é MAIOR que C= %.2f. ", soma, c);
		else
			System.out.printf("A soma de A + B é igual a %.2f e é MENOR que C= %.2f. ", soma, c);

	}

}
