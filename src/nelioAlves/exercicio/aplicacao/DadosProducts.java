package nelioAlves.exercicio.aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import nelioAlves.exercicio.model.entities.ImportedProduct;
import nelioAlves.exercicio.model.entities.Product;
import nelioAlves.exercicio.model.entities.UsedProduct;

public class DadosProducts {

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		List<Product> prods = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");

			char cui = sc.next().toLowerCase().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Price: ");
			Double price = sc.nextDouble();

			switch (cui) {
			case 'u': {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String dateStr = sc.next();
				LocalDate date = LocalDate.parse(dateStr, dtf);
				prods.add(new UsedProduct(name, price, date));
				break;
			}
			case 'i': {
				System.out.print("Customs fee: ");
				Double fee = sc.nextDouble();
				prods.add(new ImportedProduct(name, price, fee));
				break;
			}
			default:
				prods.add(new Product(name, price));
				break;
			}

		}

		for (Product p : prods) {
			System.out.println(p.priceTag());
		}

		sc.close();
	}
}
