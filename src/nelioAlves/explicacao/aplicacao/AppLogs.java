package nelioAlves.explicacao.aplicacao;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import nelioAlves.explicacao.model.entities.UsuarioLog;

public class AppLogs {

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
		Scanner sc = null;
		try (InputStream in = AppLogs.class.getResourceAsStream("/logUser.txt")) {

			Set<UsuarioLog> lines = new HashSet<>();

			sc = new Scanner(in);

			while (sc.hasNextLine()) {

				String[] fields = sc.nextLine().split(" ");
				String name = fields[0];
				LocalDateTime moment = LocalDateTime.parse(fields[1], dtf);

				lines.add(new UsuarioLog(name, moment));

			}

			System.out.println("Total de Usuarios: " + lines.size());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
