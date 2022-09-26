package exs;

import java.util.Scanner;

public class Ex_9 {

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
			System.out.printf("O menor valor é %d", b);

		else
			System.out.printf("O menor valor é %d", a);

	}
}
