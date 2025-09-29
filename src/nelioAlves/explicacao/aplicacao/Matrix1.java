package nelioAlves.explicacao.aplicacao;

import java.util.Scanner;

public class Matrix1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {

			System.out.print("Tamanho da Matrix ");
			int n = sc.nextInt();
			Integer[][] matrix1 = new Integer[n][n];

			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1[i].length; j++) {
					matrix1[i][j] = sc.nextInt();

				}
			}

			int negativos = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == j) {
						System.out.print(matrix1[i][j] + " ");
					}
					if (matrix1[i][j] < 0) {
						negativos++;
					}
				}
			}
			System.out.println("negativos: " + negativos);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
