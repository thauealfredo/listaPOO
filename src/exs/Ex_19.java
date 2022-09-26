package exs;

import java.util.Scanner;

public class Ex_19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double P1, P2, media;

		System.out.printf("Digite a nota da P1: ");
		P1 = ler.nextDouble();

		System.out.printf("Digite a nota da P2: ");
		P2 = ler.nextDouble();

		media = (P1 + (2 * P2)) / 3;

		if (media >= 5)
			System.out.printf("Sua media e de %.2f. Você foi APROVADO.", media);
		else
			System.out.printf("Sua media e de %.2f. Você foi REPROVADO.", media);

	}

}
