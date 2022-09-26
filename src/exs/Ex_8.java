package exs;

import java.util.Scanner;

public class Ex_8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, b;

		do {
			System.out.printf("Digite um valor qualquer: \n");
			a = ler.nextInt();

			System.out.printf("Digite um valor qualquer: \n");
			b = ler.nextInt();

			if (a == b)
				System.out.printf("Digite dois valores distintos.\n");

		} while (a == b);

		if (a > b)
			System.out.printf("O maior valor é %d", a);

		else
			System.out.printf("O maior valor é %d", b);

	}

}
