package nelioAlves.exercicio.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import nelioAlves.exercicio.entities.Company;
import nelioAlves.exercicio.entities.Individual;
import nelioAlves.exercicio.entities.TaxPayer;

public class CalculoTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> taxs = new ArrayList<>();

		try {
			System.out.print("Enter the number of tax payers: ");
			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) {
				System.out.println("Tax payer #" + i + " data: ");
				System.out.print("Individual or company (i/c)? ");
				char ch = sc.next().toLowerCase().charAt(0);

				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();

				System.out.print("Anual income: ");
				Double anualIncome = sc.nextDouble();

				if (ch == 'i') {
					System.out.print("Health expenditures: ");
					Double health = sc.nextDouble();
					taxs.add(new Individual(name, anualIncome, health));
				} else {
					System.out.print("Number of employees: ");
					int numberEmployees = sc.nextInt();
					taxs.add(new Company(name, anualIncome, numberEmployees));
				}
			}
			System.out.println("TAXES PAID: ");

			double sum = 0;
			for (TaxPayer t : taxs) {
				System.out.println(t.toString());
				sum += t.tax();
			}
			System.out.println();
			System.out.printf("TOTAL TAXES: $ %.2f", sum);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
