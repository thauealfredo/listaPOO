package exs;

import java.util.Scanner;

public class Ex_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int x, y;
		for (x = 1; x <= 20; x++) {
			System.out.printf("\nTabuado do %d", x);
			for (y = 1; y <= 10; y++) {
				System.out.printf("\n%d X %d = %d", y, x, (y * x));
			}
			System.out.println("\n Aperte Enter para continuar");
			ler.nextLine();

		}

	}

}
