package exs;

import java.util.Scanner;

public class Ex_17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double imc, peso, altura;
		String sexo;

		System.out.printf("Digite o sexo (M) para masculino e (F) para feminino: ");
		sexo = ler.nextLine();

		System.out.printf("Digite o peso: ");
		peso = ler.nextDouble();

		System.out.printf("Digite a altura: ");
		altura = ler.nextDouble();

		imc = peso / (altura * altura);

		switch (sexo) {

		case "F":
			if (imc < 19)
				System.out.printf("Seu imc e: %.2f. Voce esta abaixo do peso.", imc);
			else if (imc < 24)
				System.out.printf("Seu imc e: %.2f. Voce estano peso ideal.", imc);
			else
				System.out.printf("Seu imc e: %.2f. Voce esta acima do peso.", imc);
			break;

		case "f":
			if (imc < 19)
				System.out.printf("Seu imc e: %.2f. Voce esta abaixo do peso.", imc);
			else if (imc < 24)
				System.out.printf("Seu imc e: %.2f. Voce estano peso ideal.", imc);
			else
				System.out.printf("Seu imc e: %.2f. Voce esta acima do peso.", imc);
			break;

		case "M":
			if (imc < 20)
				System.out.printf("Seu imc e: %.2f. Voce esta abaixo do peso.", imc);
			else if (imc < 25)
				System.out.printf("Seu imc e: %.2f. Voce esta no peso ideal.", imc);
			else
				System.out.printf("Seu imc e: %.2f. Voce esta acima do peso.", imc);
			break;

		case "m":
			if (imc < 20)
				System.out.printf("Seu imc e: %.2f. Voce esta abaixo do peso.", imc);
			else if (imc < 25)
				System.out.printf("Seu imc e: %.2f. Voce esta no peso ideal.", imc);
			else
				System.out.printf("Seu imc e: %.2f. Voce esta acima do peso.", imc);
			break;
		}

	}

}
