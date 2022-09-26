package exs;

import java.util.Scanner;

public class Exc_42 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num1 = 0, num2 = 1, n;
		double soma = 0;
		;

		System.out.printf("Digite a quantidade de numeros da sequencia que serao somados: ");
		n = ler.nextInt();

		for (int i = 1; i <= n; i++) {
			num1 = num1 + 1;
			num2 = num2 + 1;
			soma = soma + (num1 / num2);
		}

		System.out.printf("Soma total de todos os %d da sequencia e igual a: %.2f.", n, soma);
	}
}
