package nelioAlves.exercicio.aplicacao;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			System.out.print("Quantos números você vai digitar? ");
			int n = sc.nextInt();

			Integer[] numeros = new Integer[n];

			for (int i = 0; i < numeros.length; i++) {
				System.out.print("Digite um numero: ");
				numeros[i] = sc.nextInt();
			}

			int sum = 0;
			System.out.println("Numeros Pares:");
			for (Integer num : numeros) {
				if (num % 2 == 0) {
					sum++;
					System.out.print(num + " ");
				}
			}
			System.out.println();
			System.out.print("Quant. Numeros Pares: " + sum);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			sc.close();
		}

	}
}
