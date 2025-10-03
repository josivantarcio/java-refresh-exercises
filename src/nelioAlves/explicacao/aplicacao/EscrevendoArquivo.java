package nelioAlves.explicacao.aplicacao;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class EscrevendoArquivo {

	public static void main(String[] args) {

		String caminho = "src/resources/out.txt";

		String[] texto = { "Good Morning", "Good Afternnon", "Good Night" };

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) {

			for (String linha : texto) {
				bw.write(linha);
				bw.newLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
