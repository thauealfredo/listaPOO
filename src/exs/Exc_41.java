package exs;

import java.util.Scanner;

public class Exc_41 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num, j = 1;

		System.out.printf("Digite a quantidade de numeros da sequencia que sera exibida: ");
		num = ler.nextInt();
		while (num <= 0 || num > 100) {
			System.out.printf("Erro! Numero invalido. Por favor digite novamente: ");
			num = ler.nextInt();
		}

		int seq[] = new int[num];

		for (int i = 0; i < num; i++) {
			if (i == 0) {
				seq[i] = 1 + j;
			} else {
				j = j + 2;
				seq[i] = seq[i - 1] + j;
			}
			System.out.printf("%d, ", seq[i]);
		}

	}

}
