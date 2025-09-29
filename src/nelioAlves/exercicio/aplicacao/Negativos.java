package nelioAlves.exercicio.aplicacao;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("numeros inteiros? ");
		int n = sc.nextInt();

		if (n > 10) {
			n = 10;
		}

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}

		System.out.println("Numeros negativos");
		for (int i : vetor) {
			if (i < 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
