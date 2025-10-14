package nelioAlves.explicacao.aplicacao;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProgramColletion {

	public static void main(String[] args) {

		Scanner sc = null;

		try (InputStream inReader = ProgramColletion.class.getResourceAsStream("/in2.txt")) {

			List<String> listas = new ArrayList<>();
			if (inReader == null) {
				throw new IllegalArgumentException("Dont Found File");
			} else {
				sc = new Scanner(inReader);
				while (sc.hasNextLine()) {
					listas.add(sc.nextLine());

				}
			}

			Collections.sort(listas);
			for (String st : listas) {
				System.out.println(st);
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
