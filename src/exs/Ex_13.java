package exs;

import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, b, c;

		do {
			System.out.printf("Digite um valor qualquer: \n");
			a = ler.nextInt();

			System.out.printf("Digite um valor qualquer: \n");
			b = ler.nextInt();

			System.out.printf("Digite um valor qualquer: \n");
			c = ler.nextInt();

			if (a == b || b == c)
				System.out.printf("Os valores são idênticos.\n");
		} while (a == b || b == c);

		if (a > b) {
			if (a > c) {
				System.out.printf("O maior numero é: %d.", a);
			} else {
				System.out.printf("O maior numero é: %d.", c);
			}
		}

		else if (b > c)
			System.out.printf("O maior numero é: %d.", b);
		else {
			System.out.printf("O maior numero é: %d.", c);
		}

	}

}
