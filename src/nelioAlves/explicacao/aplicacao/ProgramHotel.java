package nelioAlves.explicacao.aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import nelioAlves.explicacao.entities.Reservation;

public class ProgramHotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Room number: ");
		int number = sc.nextInt();
		
		//convertendo para data
		System.out.print("Check-In date (DD/MM/YYYY): ");
		String checkInStr = sc.next();
		LocalDate checkIn = LocalDate.parse(checkInStr, dtf);
		
		//a mesma coisa do de cima, porem simplificado
		System.out.print("Check-Out date (DD/MM/YYYY): ");
		LocalDate checkOut = LocalDate.parse(sc.next(), dtf);
		
		if(checkOut.isBefore(checkIn)) {
			System.out.println("Error in reservetion: Check-out date must be after check-in date");
		}
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			
			System.out.print("Check-In date (DD/MM/YYYY): ");
			checkIn = LocalDate.parse(sc.next(), dtf);
			
			System.out.print("Check-Out date (DD/MM/YYYY): ");
			checkOut = LocalDate.parse(sc.next(), dtf);
			reservation.updateDate(checkIn, checkOut);
			
			LocalDate now = LocalDate.now();
			if(checkIn.isBefore(now) || checkOut.isBefore(now)) {
				System.out.println("Error in reservation: Reservation dates for update must be future");
			}
			else if(checkOut.isBefore(checkIn)){
				System.out.println("Error in reservetion: Check-out date must be after check-in date");
			}
			else {
				reservation = new Reservation(number, checkIn, checkOut);
				System.out.println("Reservation: " + reservation);
			}
		}
		
		sc.close();
	}
}
