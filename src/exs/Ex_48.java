package exs;

import java.util.Scanner;

public class Ex_48 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.printf("Insira um numero: ");
		int n = ler.nextInt();
		for (int x = 1; x < 21; x++) {
			System.out.printf("%d\n", n + x);
		}
	}

}
