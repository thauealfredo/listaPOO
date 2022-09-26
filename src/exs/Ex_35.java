package exs;

import java.util.Scanner;

public class Ex_35 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, x;

		do {
			System.out.printf("Digite um valor de entrada (positivo)!!.");
			a = ler.nextInt();
		} while (a < 0);
		System.out.printf("Taboada do %d", a);
		for (x = 1; x <= 10; x++) {
			System.out.printf("\n %d X %d = %d", x, a, (a * x));
		}

	}

}
