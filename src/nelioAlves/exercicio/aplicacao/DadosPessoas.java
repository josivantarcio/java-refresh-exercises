package nelioAlves.exercicio.aplicacao;

import java.util.Scanner;

import nelioAlves.exercicio.model.entities.Pessoa;

public class DadosPessoas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {

			System.out.print("Quantas Pessoas serão digitadas? ");
			int n = sc.nextInt();

			Pessoa[] pessoas = new Pessoa[n];

			for (int i = 0; i < pessoas.length; i++) {
				System.out.print("Altura da " + (i + 1) + "a Pessoa: ");
				double altura = sc.nextDouble();

				System.out.print("Genero da " + (i + 1) + "a Pessoa: ");
				char genero = sc.next().toUpperCase().charAt(0);

				pessoas[i] = new Pessoa(altura, genero);
			}

			double menorAltura = 0, maiorAltura = 0, mediaAltura = 0;
			int numeroHomens = 0;

			for (Pessoa pessoa : pessoas) {
				// Menor Altura

				if (menorAltura == 0 || pessoa.getHigh() < menorAltura) {
					menorAltura = pessoa.getHigh();
				}

				// Maior Altura
				if (maiorAltura == 0 || pessoa.getHigh() > maiorAltura) {
					maiorAltura = pessoa.getHigh();
				}

				// Numero de Homens
				if (pessoa.getGenero() == 'M') {
					numeroHomens++;
				}

				// Media Alturas Mulheres
				if (pessoa.getGenero() == 'F') {
					mediaAltura += pessoa.getHigh();
				}
			}
			mediaAltura = mediaAltura / (pessoas.length - numeroHomens);

			System.out.print("Menor Altura: " + menorAltura);
			System.out.print("\nMaior Altura: " + maiorAltura);
			System.out.printf("\nMedia Altura das Mulheres: %.2f%n", mediaAltura);
			System.out.print("Número de Homens: " + numeroHomens);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
