package nelioAlves.explicacao.model.services;

import java.time.Duration;

import nelioAlves.explicacao.model.entities.CarRental;
import nelioAlves.explicacao.model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;

	private BrazilTaxService brazilTaxService;

	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService brazilTaxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.brazilTaxService = brazilTaxService;
	}

	public void processInvoice(CarRental carRental) {
		Long minutos = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		Double hours = minutos / 60.0;

		double payment;
		if (hours <= 12) {
			payment = pricePerHour * Math.ceil(hours);
		} else {
			payment = pricePerDay * Math.ceil(hours / 24);
		}

		double tax = brazilTaxService.tax(payment);
		carRental.setInvoice(new Invoice(payment, tax));

	}
}
