package exs;

import java.util.Scanner;

public class Ex_15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, b, c;

		System.out.printf("Digite o valor do primeiro lado do triângulo: ");
		a = ler.nextInt();

		System.out.printf("Digite o valor do segundo lado do triângulo: ");
		b = ler.nextInt();

		System.out.printf("Digite o valor do terceiro lado do triângulo: ");
		c = ler.nextInt();

		if (a + b > c || b + c > a || c + a > b) {
			if (a == b && b == c) {
				System.out.printf("Os tres valores digitados formam um triangulo equilatero.");
			} else if (a == b || b == c || c == a) {
				System.out.printf("Os tres valores digitados formam um triangulo isosceles.");
			} else {
				System.out.printf("Os tres  valores digitados formam um triangulo escaleno.");
			}
		} else {
			System.out.printf("Os tres valores digitados não formam um triangulo.");
		}
	}

}
