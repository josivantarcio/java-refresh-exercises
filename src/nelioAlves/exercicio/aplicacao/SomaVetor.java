package nelioAlves.exercicio.aplicacao;

import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();

		double[] vet = new double[n];

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}

		double soma = 0;
		System.out.print("Valores = ");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
			soma += vet[i];
		}
		System.out.print("\nSoma = " + soma);
		System.out.print("\nMedia = " + soma / vet.length);

		sc.close();
	}
}
