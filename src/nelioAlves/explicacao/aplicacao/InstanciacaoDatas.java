package nelioAlves.explicacao.aplicacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciacaoDatas {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.now();
		System.out.println("d01 = " + d01);
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("d02 = " + d02);
		
		Instant d03 = Instant.now();
		System.out.println("d03 = " + d03);
		
		LocalDate d04 = LocalDate.parse("1978-03-07");
		System.out.println("d04 = " + d04);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d05 = LocalDate.parse("07/09/2025", fmt1);
		System.out.println("d05 = " + d05);
		
		LocalDate d06 = LocalDate.parse("20/02/1998 11:59", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.println("d06 = " + d06);
		
		LocalDateTime d07 = LocalDateTime.parse("07/02/1993 10:18", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.println("d07 = " + d07);
		
		LocalDate d08 = LocalDate.of(2025, 01, 14);
		System.out.println("d08 = " + d08);
		
		LocalDateTime d09 = LocalDateTime.of(2025, 9, 02, 10, 15);
		System.out.println("d09 = " + d09);
		
	}

}
