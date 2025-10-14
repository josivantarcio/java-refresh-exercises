package nelioAlves.explicacao.aplicacao;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import nelioAlves.explicacao.model.entities.EmployeeColletions;

public class ProgramaColletions2 {

	public static void main(String[] args) {

		Scanner sc = null;

		try (InputStream is = ProgramaColletions2.class.getResourceAsStream("/int3.txt")) {

			List<EmployeeColletions> listaEmployee = new ArrayList<>();

			if (is == null) {
				throw new IllegalArgumentException("Dont Found File");
			} else {
				sc = new Scanner(is);
				while (sc.hasNextLine()) {
					String[] line = sc.nextLine().split(",");
					if (line.length < 2)
						continue;

					String name = line[0];
					Double salary = Double.valueOf(line[1]);

					listaEmployee.add(new EmployeeColletions(name, salary));

				}
			}
			Collections.sort(listaEmployee);
			for (EmployeeColletions emp : listaEmployee) {
				System.out.println(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
