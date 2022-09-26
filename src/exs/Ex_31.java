package exs;

import java.util.Scanner;

public class Ex_31 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a;

		do {
			System.out.printf("Digite um valor de entrada (positivo)!!.");
			a = ler.nextInt();
		} while (a < 0);
	}

}
