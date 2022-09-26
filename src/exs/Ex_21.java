package exs;

import java.util.Scanner;

public class Ex_21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opc;
		double A, B, OP;

		do {
			System.out.printf("Digite um valor qualquer: ");
			A = ler.nextDouble();

			System.out.printf("Digite um valor qualquer: ");
			B = ler.nextDouble();

			System.out.printf("Menu de Opcoes:");
			System.out.printf("Opcao 1 - Multiplicacao.");
			System.out.printf("Opcao 2 - Adicao.");
			System.out.printf("Opcao 3 - Divisao.");
			System.out.printf("Opcao 4 - Subtracao.");
			System.out.printf("Opcao 5 - Finalizar processo.");
			System.out.printf("Digite a opcao desejada: ");
			opc = ler.nextInt();

			switch (opc) {
			case 1:
				OP = A * B;
				System.out.printf("Multiplicacao entre: %.2f e %.2f =  %.2f.\n", A, B, OP);
				break;

			case 2:
				OP = A + B;
				System.out.printf("Adicao entre: %.2f e %.2f = %.2f.\n", A, B, OP);
				break;

			case 3:
				if (B == 0) {
					System.out.printf("Digite um denominador diferente de 0. (Inválido) \n");
					break;
				}

				OP = A / B;
				System.out.printf("O resultado da divisao entre: %.2f e %.2f resulta em: %.2f.\n", A, B, OP);
				break;

			case 4:

				OP = A - B;
				System.out.printf("O resultado da subtracao entre: %.2f e %.2f resulta em: %.2f.\n", A, B, OP);
				break;

			case 5:
				System.exit(0);
				break;

			default:
				System.out.printf("Opcao inválida. Escolha novamente.\n");
			}

		} while (opc != 5);

	}

}
