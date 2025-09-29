package nelioAlves.exercicio.aplicacao;

import java.util.Scanner;

import nelioAlves.exercicio.entities.Aluno;

public class Aprovados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {

			System.out.print("Quantos Alunos serão digitados? ");
			int n = sc.nextInt();

			Aluno[] alunos = new Aluno[n];

			for (int i = 0; i < alunos.length; i++) {

				System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
				sc.nextLine();
				String nome = sc.nextLine();
				double nota1 = sc.nextDouble();
				double nota2 = sc.nextDouble();

				alunos[i] = new Aluno(nota1, nota2, nome);
			}

			System.out.println("Alunos aprovados:");
			for (Aluno aluno : alunos) {
				double media = (aluno.getNota1() + aluno.getNota2()) / 2;
				if (media >= 6.0) {
					System.out.println(aluno.getNome());
				}
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
