package nelioAlves.exercicio.aplicacao;

import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		Integer[] numeros = new Integer[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt();
		}

		Integer maiorNumero = null;
		Integer posicao = null;
		for (int i = 0; i < numeros.length; i++) {
			if (maiorNumero == null) {
				maiorNumero = numeros[i];
			}

			if (numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
				posicao = i+1;
			}

		}

		System.out.println("Maior Número: " + maiorNumero);
		System.out.println("Posicao do Maior Número: " + posicao);

		sc.close();
	}

}
