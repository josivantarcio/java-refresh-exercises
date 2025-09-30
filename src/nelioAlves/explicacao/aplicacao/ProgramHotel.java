package nelioAlves.explicacao.aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import nelioAlves.explicacao.model.entities.Reservation;
import nelioAlves.explicacao.model.exceptions.DomainException;

public class ProgramHotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();

			// convertendo para data
			System.out.print("Check-In date (DD/MM/YYYY): ");
			String checkInStr = sc.next();
			LocalDate checkIn = LocalDate.parse(checkInStr, dtf);

			// a mesma coisa do de cima, porém simplificado
			System.out.print("Check-Out date (DD/MM/YYYY): ");
			LocalDate checkOut = LocalDate.parse(sc.next(), dtf);

			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			// Atualização de Reserva
			System.out.println();
			System.out.println("Enter data to update the reservation: ");

			System.out.print("Check-In date (DD/MM/YYYY): ");
			checkIn = LocalDate.parse(sc.next(), dtf);

			System.out.print("Check-Out date (DD/MM/YYYY): ");
			checkOut = LocalDate.parse(sc.next(), dtf);

			reservation.updateDate(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

		} catch (DomainException e) {
			System.out.println("Erro " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}

		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
