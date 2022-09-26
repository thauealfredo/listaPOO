package exs;

import java.util.Scanner;

public class Ex_47 {

	static int fatorial(int num) {
		if (num == 1 || num == 0)
			return 1;
		else
			return num * fatorial(num - 1);
	}

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String cont;

		do {
			System.out.println("Informe o numero");
			int num = ler.nextInt();
			int resultado = 0;

			while (num < 0) {
				System.out.println("Numero invalido ");
				System.out.println("Informe um numero positivo ");
			}

			resultado = fatorial(num);
			System.out.printf("O resultado é %d", resultado);
			System.out.println("");

			System.out.println("Deseja refazer ? [S] [N]");
			cont = ler.next();

		} while (cont.equals("S"));

		System.exit(0);

	}

}
