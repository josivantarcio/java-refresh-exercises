package nelioAlves.explicacao.aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import nelioAlves.explicacao.model.entities.CarRental;
import nelioAlves.explicacao.model.entities.Vehicle;
import nelioAlves.explicacao.model.services.BrazilTaxService;
import nelioAlves.explicacao.model.services.RentalService;

public class ProgramCarRental {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();

		System.out.print("Retirada (DD/MM/YYYY HH:MM): ");
		LocalDateTime startRental = LocalDateTime.parse(sc.nextLine(), dtf);

		System.out.print("Retorno (DD/MM/YYYY HH:MM): ");
		LocalDateTime finishtRental = LocalDateTime.parse(sc.nextLine(), dtf);

		CarRental cr = new CarRental(startRental, finishtRental, new Vehicle(carModel));

		System.out.print("Entre com o preço por Hora: ");
		Double perHour = sc.nextDouble();

		System.out.print("Entre com o preço por Dia: ");
		Double perDay = sc.nextDouble();

		RentalService rs = new RentalService(perHour, perDay, new BrazilTaxService());
		rs.processInvoice(cr);

		System.out.println("FATURA");
		System.out.println("Pagamento basico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Pagamento Total: " + String.format("%.2f", cr.getInvoice().totalPayment()));

		sc.close();
	}

}
