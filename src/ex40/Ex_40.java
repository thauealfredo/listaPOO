package ex40;

public class Ex_40 {

	public static void main(String[] args) {
		Pilha p = new Pilha();

		p.empilhar(1);
		p.empilhar(1);
		p.empilhar(1);
		int temp = 0, valor = 0, x = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println(1);
		}

		while (x < 20) {
			temp = p.tamanho();

			valor += (int) p.pilha[temp - 1];
			valor += (int) p.pilha[temp - 2];
			valor += (int) p.pilha[temp - 3];

			System.out.println(valor);

			p.empilhar(valor);
			valor = 0;

			x++;
		}

	}

}