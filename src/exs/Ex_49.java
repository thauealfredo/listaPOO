package exs;

import java.util.Scanner;

public class Ex_49 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int soma = 0;

		System.out.printf("Insira o numero inicial: ");
		int ninicial = ler.nextInt();
		System.out.printf("Insira o numero final: ");
		int nfinal = ler.nextInt();
		while (nfinal <= ninicial) {
			System.out.printf("O numero final deve ser maior que o inicial: ");
			nfinal = ler.nextInt();
		}
		for (int x = ninicial; x <= nfinal; x++) {
			soma += x;
		}
		System.out.printf("A soma da sequencia de numeros entre %d e %d e: %d", ninicial, nfinal, soma);

	}

}
