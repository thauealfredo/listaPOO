package exs;

import java.util.Scanner;

public class Ex_30 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double preco, pagar;
		int opc;

		System.out.printf("Digite o valor do protudo: ");
		preco = ler.nextDouble();

		System.out.printf("Opções de pagamento:\n ");
		System.out.printf("1 - À vista, dinheiro ou cheque.\n ");
		System.out.printf("2- -À vista no cartao de credito.\n ");
		System.out.printf("3 - Em duas vezes.\n ");
		System.out.printf("4 - Em quatro vezes.\n ");
		System.out.printf("Digite a forma de pagamento:\n ");
		opc = ler.nextInt();

		switch (opc) {
		case 1:

			pagar = preco - (preco * 0.10);
			System.out.printf("O total a ser pago e de: %.2f.", pagar);

			break;

		case 2:

			pagar = preco - (preco * 0.15);
			System.out.printf("O total a ser pago e de: %.2f.", pagar);

			break;

		case 3:

			pagar = preco;
			System.out.printf("O total a ser pago e de: %.2f.", pagar);

			break;

		case 4:

			pagar = preco + (preco * 0.1);
			System.out.printf("O total a ser pago e de: %.2f.", pagar);

			break;

		default:
			System.out.println("Opcao invalida.");
		}
	}

}
