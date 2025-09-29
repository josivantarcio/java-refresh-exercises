package nelioAlves.exercicio.aplicacao;

import java.util.Scanner;

import nelioAlves.exercicio.entities.Pessoa;

public class MaisVelho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			System.out.print("Quantas pessoas voce vai digitar? ");
			int n = sc.nextInt();

			Pessoa[] pessoas = new Pessoa[n];

			for (int i = 0; i < pessoas.length; i++) {
				System.out.println("Dados da " + (i + 1) + "a pessoa:");
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();

				System.out.print("Idade: ");
				int idade = sc.nextInt();

				pessoas[i] = new Pessoa(nome, idade);
			}

			String nomePessoaVelha = null;
			int idade = 0;
			for (Pessoa pessoa : pessoas) {
				if (pessoa.getYearOld() > idade || idade == 0) {
					idade = pessoa.getYearOld();
					nomePessoaVelha = pessoa.getName();
				}
			}

			System.out.print("Pessoa Mais Velha: " + nomePessoaVelha);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}
