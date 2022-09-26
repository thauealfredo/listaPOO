package exs;

import java.util.Scanner;

public class Ex_32 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, b;
		System.out.printf("Digite o primeiro valor!!.");
		a = ler.nextInt();

		do {
			System.out.printf("Digite segunddo valor, sendo ele maior que o primeiro!!.");
			b = ler.nextInt();
		} while (a >= b);

	}

}
