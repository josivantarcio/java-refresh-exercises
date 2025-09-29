package nelioAlves.explicacao.aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import nelioAlves.explicacao.entities.Department;
import nelioAlves.explicacao.entities.enums.WorkerLevel;
import nelioAlves.explicacao.util.HourContract;
import nelioAlves.explicacao.util.Worker;

public class Composition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		try {

			System.out.print("Enter department's name: ");
			String department = sc.nextLine();

			System.out.println("Enter worker data");
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Level: ");
			String level = sc.next().toUpperCase();

			System.out.print("Base Salary: ");
			double salary = sc.nextDouble();

			Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, new Department(department));

			System.out.print("How many contracts to this worker? ");
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				System.out.println("Enter contract #" + (i + 1) + " data: ");
				System.out.print("Date (DD/MM/YYYY) ");
				String dataStr = sc.next();
				LocalDate data = LocalDate.parse(dataStr, dtf);
				//LocalDate data = dtf.parse(sc.next(), LocalDate::from);
				
				System.out.print("Value per hour: ");
				double value = sc.nextDouble();

				System.out.print("Duration (hours): ");
				int hours = sc.nextInt();

				HourContract hourContratc = new HourContract(data, value, hours);
				worker.addContract(hourContratc);
			}

			System.out.print("Enter month and year top calculate income:  ");
			String dataStr = sc.next();

			String[] data = dataStr.split("/");
			int ano = Integer.parseInt(data[1]);
			int mes = Integer.parseInt(data[0]);

			double sum = worker.income(ano, mes);

			System.out.println(worker + "\n$" + sum);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}
}
