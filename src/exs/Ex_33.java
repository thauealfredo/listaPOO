package exs;

import java.util.Scanner;

public class Ex_33 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		char a;

		do {
			System.out.printf("Digite o sexo fo usuário (F/M): ");
			a = ler.next().charAt(0);
		} while (a != 'F' && a != 'M');

	}

}
