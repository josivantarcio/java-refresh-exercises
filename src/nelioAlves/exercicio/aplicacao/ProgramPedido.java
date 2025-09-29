package nelioAlves.exercicio.aplicacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import nelioAlves.exercicio.entities.Client;
import nelioAlves.exercicio.entities.Order;
import nelioAlves.exercicio.entities.OrderItem;
import nelioAlves.exercicio.entities.Product;
import nelioAlves.explicacao.entities.enums.OrderStatus;

public class ProgramPedido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {

			System.out.println("Enter cliente data:");
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Birth date (DD/MM/YYYY): ");
			String dataStr = sc.nextLine();
			LocalDate date = LocalDate.parse(dataStr, dtf);

			System.out.println("Enter order data: ");
			System.out.print("STATUS: ");
			String status = sc.next().toUpperCase();

			System.out.print("How Many items to this order? ");
			int n = sc.nextInt();
	
			Client client = new Client(name, email, date);
			Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);

			for (int i = 0; i < n; i++) {

				sc.nextLine();
				System.out.println("Enter #" + (1 + i) + " item data: ");
				System.out.print("Product name: ");
				String nameProduct = sc.nextLine();

				System.out.print("Product price: ");
				double priceProduct = sc.nextDouble();

				System.out.print("Quantity: ");
				int quantProduct = sc.nextInt();

				Product product = new Product(nameProduct, priceProduct);
				OrderItem orderItems = new OrderItem(quantProduct, priceProduct, product);
				order.addOrderItem(orderItems);

			}

			System.out.println(order);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
