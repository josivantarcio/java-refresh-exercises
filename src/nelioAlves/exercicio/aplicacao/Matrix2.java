package nelioAlves.exercicio.aplicacao;

import java.util.Scanner;

public class Matrix2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Digite Número: ");
			int M = sc.nextInt();

			System.out.print("Digite Outro Número: ");
			int N = sc.nextInt();

			int[][] X = new int[M][N];

			for (int i = 0; i < X.length; i++) {
				for (int j = 0; j < X[i].length; j++) {
					System.out.print("Digite um numero da matriz [" + i + "] [" + j + "] : ");
					X[i][j] = sc.nextInt();

				}
			}

			System.out.print("Escolha um numero: ");
			int x = sc.nextInt();

			for (int i = 0; i < X.length; i++) {
				for (int j = 0; j < X[i].length; j++) {
					if (x == X[i][j]) {

						if (j > 0) {
							System.out.print("\nà esquerda: " + X[i][j - 1]);
						}
						if (i > 0) {
							System.out.print("\nacima: " + X[i - 1][j]);
						}
						if (j < N - 1) {
							System.out.print("\nà direita: " + X[i][j + 1]);
						}
						if (i < M - 1) {
							System.out.print("\nabaixo: " + X[i + 1][j]);
						}

					}
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
