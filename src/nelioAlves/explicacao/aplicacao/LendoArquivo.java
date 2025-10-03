package nelioAlves.explicacao.aplicacao;

import java.io.InputStream;
import java.util.Scanner;

public class LendoArquivo {

	public static void main(String[] args) {

		Scanner sc = null;
		try (InputStream in = LendoArquivo.class.getResourceAsStream("/in.txt")) {
			if (in == null) {
				throw new IllegalArgumentException("Don't found file or don't exist");
			}
			sc = new Scanner(in);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
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
