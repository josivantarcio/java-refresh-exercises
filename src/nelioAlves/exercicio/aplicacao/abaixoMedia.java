package nelioAlves.exercicio.aplicacao;

import java.util.Scanner;

public class abaixoMedia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		Double[] vet = new Double[n];

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}

		Double soma = 0.0, media;
		for (Double num : vet) {
			soma += num;
		}

		media = soma / vet.length;

		System.out.printf("Media do Vetor: %.3f%n", media);

		System.out.println("Elementos Abaixo da Média:");
		for (Double abaixo : vet) {
			if (abaixo < media) {
				System.out.printf("%.1f%n", abaixo);
			}
		}

		sc.close();

	}

}
