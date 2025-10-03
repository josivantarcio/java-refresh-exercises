package nelioAlves.exercicio.aplicacao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import nelioAlves.exercicio.model.entities.Produto;

public class PovoandoArquivo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner strSc = new Scanner(System.in);

		try {

			System.out.println("Digite o caminho da origem:");
			String strPathOrigem = strSc.nextLine();

			List<Produto> produtos = new ArrayList<>();

			try (InputStream is = new FileInputStream(strPathOrigem); Scanner sc = new Scanner(is)) {

				while (sc.hasNextLine()) {

					String line = sc.nextLine();
					String[] campos = line.split(",");
					String nome = campos[0];
					Double preco = Double.valueOf(campos[1]);
					Double quantidade = Double.valueOf(campos[2]);

					Produto prod = new Produto(nome, preco, quantidade);
					produtos.add(prod);

				}
			}

			// criacao da pasta de saída
			File sourceFile = new File(strPathOrigem);
			File parentFolder = sourceFile.getParentFile();

			File outFolder = new File(parentFolder, "out");
			if (!outFolder.exists()) {
				boolean newFolder = outFolder.mkdir();
				if (!newFolder) {
					throw new IllegalArgumentException("Pasta nao foi criada");
				}
			}

			// criacao do arquivo destino
			File outFile = new File(outFolder, "summary2.txt");

			// escrever no arquivo destino
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {

				for (Produto p : produtos) {
					bw.write(p.toString());
					bw.newLine();
				}

			}

			System.out.println("Arquivo criado em: " + outFile.getAbsolutePath());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (strSc != null) {
				strSc.close();
			}
		}
	}
}
