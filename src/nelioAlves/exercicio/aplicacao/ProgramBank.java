package nelioAlves.exercicio.aplicacao;

import java.util.Scanner;

import nelioAlves.exercicio.model.entities.Account;
import nelioAlves.exercicio.model.exceptions.DomainException;

public class ProgramBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("==== Bank ====");
			System.out.print("number: ");
			Integer number = sc.nextInt();

			sc.nextLine();
			System.out.print("Name holder: ");
			String holder = sc.nextLine();

			System.out.print("Initial Balance: ");
			Double balance = sc.nextDouble();

			System.out.print("withdraw Limit: ");
			Double withdrawLimit = sc.nextDouble();

			Account account = new Account(number, holder, balance, withdrawLimit);
			System.out.println(account);

			System.out.println("New deposit $ ");
			account.deposit(sc.nextDouble());
			System.out.println(account);

			System.out.println("New Withdraw $ ");
			account.withdraw(sc.nextDouble());
			System.out.println(account);

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
