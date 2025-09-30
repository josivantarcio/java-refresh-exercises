package nelioAlves.explicacao.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import nelioAlves.explicacao.model.entities.Employees;
import nelioAlves.explicacao.model.entities.Outsourced;

public class ComissaoFuncionarios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de Funcionarios ");
		int n = sc.nextInt();

		List<Employees> employees = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.print("Employee #" + (1 + i) + " data: ");
			System.out.print("\n Outsourced (y/n)? ");
			char terceiro = sc.next().toLowerCase().charAt(0);

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Hours: ");
			Integer hours = sc.nextInt();

			System.out.print("Value per hours: ");
			Double valueHours = sc.nextDouble();

			if (terceiro == 'y') {
				System.out.print("Additional charge: ");
				Double addValeu = sc.nextDouble();

				employees.add(new Outsourced(name, hours, valueHours, addValeu));
			} else {
				employees.add(new Employees(name, hours, valueHours));
			}
		}

		for (Employees e : employees) {

			System.out.println(e.toString());
		}

		sc.close();
	}

}
