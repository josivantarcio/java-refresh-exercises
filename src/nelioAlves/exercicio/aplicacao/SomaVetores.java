package nelioAlves.exercicio.aplicacao;

import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor?");
		int n = sc.nextInt();

		Integer[] A = new Integer[n];
		Integer[] B = new Integer[n];

		System.out.println("Digite Valores do Vetor A:");
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}

		System.out.println("Digite Valores do Vetor B:");
		for (int i = 0; i < B.length; i++) {
			B[i] = sc.nextInt();
		}

		Integer[] C = new Integer[n];
		for (int i = 0; i < C.length; i++) {
			C[i] = A[i] + B[i];
		}

		System.out.println("Vetor Resultante:");
		for (Integer num : C) {
			System.out.println(num);
		}

		sc.close();
	}

}
