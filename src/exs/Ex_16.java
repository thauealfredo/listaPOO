package exs;

import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, b, c;

		System.out.printf("Digite o valor do primeiro lado do triângulo  ou hipotenusa: ");
		a = ler.nextInt();

		System.out.printf("Digite o valor do segundo lado do triângulo: ");
		b = ler.nextInt();

		System.out.printf("Digite o valor do terceiro lado do triângulo: ");
		c = ler.nextInt();

		if ((a * a) == (b * b) + (c * c))
			System.out.printf("Os valores digitados formam um triangulo retangulo.");
		else
			System.out.printf("Os valores digitados nao formam um triangulo retangulo.");

	}

}
