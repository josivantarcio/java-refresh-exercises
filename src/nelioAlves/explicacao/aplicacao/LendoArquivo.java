package nelioAlves.explicacao.aplicacao;

import java.io.InputStream;
import java.util.Scanner;

public class LendoArquivo {

	public static void main(String[] args) {
		Scanner sc = null;

		try {
			InputStream in = LendoArquivo.class.getResourceAsStream("/in.txt");
			
			if(in == null) {
				throw new IllegalArgumentException("Arquivo nao encontrado!");
			}
			sc = new Scanner(in);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}
}
