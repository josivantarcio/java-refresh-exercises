package nelioAlves.exercicio.aplicacao;

import java.util.Scanner;

import nelioAlves.exercicio.entities.Pessoa;

public class Alturas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("Quantas pessoas serão digitadas? ");
			int numPessoas = sc.nextInt();

			Pessoa[] pessoas = new Pessoa[numPessoas];

			for (int i = 0; i < numPessoas; i++) {
				System.out.println("Dados da " + (i + 1) + "a pessoa:");
				System.out.print("Nome: ");
				sc.nextLine();
				String name = sc.nextLine();

				System.out.print("Idade: ");
				int idade = sc.nextInt();

				System.out.print("Altura: ");
				double altura = sc.nextDouble();

				pessoas[i] = new Pessoa(name, idade, altura);

			}
			
			double media = 0.0, soma = 0, menor16 = 0;
			for (Pessoa pessoa : pessoas) {
				soma += pessoa.getHigh(); //Somando altura das pessoas

				//somar se for maior de 16 anos
				if (pessoa.getYearOld() < 16) {
					menor16++;
				}
			}
			media = soma / pessoas.length; 
			menor16 = (menor16 / pessoas.length) * 100;

			System.out.print("Altura Media: " + media);
			System.out.println("\nPessoas com menos de 16 anos: " + menor16 + "%");

			for (Pessoa pessoa : pessoas) {
				if (pessoa.getYearOld() < 16) {
					System.out.println(pessoa.getName());
				}
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {

			sc.close();
		}

	}

}
