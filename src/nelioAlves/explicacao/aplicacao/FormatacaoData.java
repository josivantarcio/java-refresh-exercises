package nelioAlves.explicacao.aplicacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatacaoData {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2002-07-09");
		LocalDateTime d05 = LocalDateTime.parse("2022-05-01T14:26:21");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(d04.format(fmt1));
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		System.out.println(r1);
		
	}
	
}
