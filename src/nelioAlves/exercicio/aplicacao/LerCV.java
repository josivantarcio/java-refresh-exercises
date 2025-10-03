package nelioAlves.exercicio.aplicacao;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class LerCV {

	public static void main(String[] args) {

		Scanner sc = null;
		String path = "/home/josivan/Documentos/CV/Josevan_Oliveira_PT.txt";
		try (InputStream is = new FileInputStream(path)) {
		sc = new Scanner(is);

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
				System.out.println("Finalizou o sc.");
			}
		}

	}

}
