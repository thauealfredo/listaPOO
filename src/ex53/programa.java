package ex53;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Aluno[] listaAlunos = new Aluno[5];
		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			Aluno a = new Aluno();
			System.out.printf("Dados do aluno %d", i + 1);
			System.out.println("");

			System.out.printf("Nome");
			a.nome = ler.next();
			//listaAlunos[i].nome = ler.next();

			System.out.println("RA");
			a.ra = ler.next();

			System.out.println("Periodo");
			a.periodo = ler.next();

			System.out.println("Materias");

			for (int j = 0; j < 6; j++) {
				System.out.printf("Inciais da %d ° materia", j + 1);
				System.out.println("");
				a.materias[j] = ler.next();
			}
			System.out.println("");

			listaAlunos[i] = a;

		}

		for (int i = 0; i < 5; i++) {
			if (listaAlunos[i].periodo.equals("noite") || listaAlunos[i].periodo.equals("NOITE")   ) {
				System.out.println("Alunos cursando o periodo noturno");
				System.out.println(listaAlunos[i].nome);
			}
		}
		
	}

}
