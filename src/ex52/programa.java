package ex52;

import java.util.Scanner;


public class programa {

	public static void main(String[] args) {

		Produto[] listaProdutos = new Produto[10];
		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			Produto prod = new Produto();

			prod.id = i;

			System.out.printf("Descrição do produto: ");
			prod.descricao = ler.next();

			System.out.printf("Valor do produto: ");
			prod.valor = ler.nextDouble();

			System.out.printf("Quantidade do produto: ");
			prod.quantidade = ler.nextDouble();

			listaProdutos[i] = prod;
		}

		for (int i = 0; i < 10; i++) {
			if (listaProdutos[i].valor < 100) {
				System.out.printf("ID: %d - DESC: %s", listaProdutos[i].id, listaProdutos[i].descricao);
				System.out.println("");
			}
		}

	}
}
