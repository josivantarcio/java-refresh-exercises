package nelioAlves.exercicio.aplicacao;

import java.util.Scanner;

import nelioAlves.exercicio.util.CurrencyConverter;

public class CotacaoDollar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("what's dollar price? ");
		Double priceDollar = sc.nextDouble();

		System.out.print("How many dollar will be bought? ");
		Double quantityDollar = sc.nextDouble();

		double real = CurrencyConverter.calcularDollar(priceDollar, quantityDollar);
		System.out.printf("Amount to be paid in reais: $%.2f", real);

		sc.close();
	}
}
