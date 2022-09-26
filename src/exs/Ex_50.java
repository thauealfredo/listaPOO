package exs;

import java.util.Scanner;

public class Ex_50 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.printf("Insira o numero inicial: ");
		int ninicial = ler.nextInt();
		System.out.printf("Insira o numero final: ");
		int nfinal = ler.nextInt();

		while (nfinal <= ninicial) {
			System.out.printf("O numero final deve ser maior que o inicial: ");
			nfinal = ler.nextInt();
		}
		System.out.printf("Os numeros pares inteiros maiores que 10 entre %d e %d são:\n", ninicial, nfinal);
		for (int x = ninicial; x <= nfinal; x++) {
			if (x > 10 && (x % 2) == 0) {
				System.out.printf("%d\n", x);
			}
		}

	}

}
