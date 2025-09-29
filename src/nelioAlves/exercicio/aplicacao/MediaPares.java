package nelioAlves.exercicio.aplicacao;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		Integer[] pares = new Integer[n];

		for (int i = 0; i < pares.length; i++) {
			System.out.print("Digite um Numero: ");
			pares[i] = sc.nextInt();
		}

		double soma = 0;
		int i = 0;
		for (Integer par : pares) {
			if (par % 2 == 0) {
				soma += par;
				i++;
			}
		}
		Double media = soma / i;
		
		if (i != 0)
			System.out.printf("Media dos Pares: %.1f%n", media);
		else
			System.out.println("NENHUM NUMERO PAR");
		
		sc.close();
	}

}
