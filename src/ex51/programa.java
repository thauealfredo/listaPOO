package ex51;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {

		Cliente[] listaClientes = new Cliente[5];
		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			Cliente cl = new Cliente();

			cl.id = i;

			System.out.printf("Digite o nome: ");
			cl.nome = ler.next();

			System.out.printf("Digite a idade: ");
			cl.idade = ler.nextInt();

			System.out.printf("Digite o email: ");
			cl.email = ler.next();

			listaClientes[i] = cl;
		}

		for (int i = 0; i < 5; i++) {
			if (listaClientes[i].idade > 18) {
				System.out.printf("%s - %d", listaClientes[i].nome, listaClientes[i].idade);
				System.out.println("");
			}
		}

	}
}
