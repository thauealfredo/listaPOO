package exs;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, b, area;

		System.out.printf("Digite o valor da base: \n");
		a = ler.nextInt();

		System.out.printf("Digite o valor da altura: \n");
		b = ler.nextInt();

		area = a * b;

		System.out.printf("A area do retângulo é: %d \n", area);

	}

}
