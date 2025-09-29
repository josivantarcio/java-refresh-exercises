package nelioAlves.explicacao.aplicacao;

import java.util.Scanner;

public class ExplicacaoArray {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas posições?");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um valor: ");
			vetor[i] = sc.nextDouble();
		}

		double soma = 0;
		for (double d : vetor) {
			soma += d;
		}
		
		double media = soma / n;
		System.out.println("Media " + media);
		
		
		
		
		
		sc.close();
	}

}
