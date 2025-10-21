package nelioAlves.exercicio.aplicacao;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import nelioAlves.exercicio.model.entities.Candidatos;

public class AppApuracaoVotos {

	public static void main(String[] args) {

		String resourcePath = "/resources/urna001.txt";
		if (args.length > 0) {
			resourcePath = args[0];
		}

		try (InputStream in = AppApuracaoVotos.class.getResourceAsStream(resourcePath)) {
			
			if (in == null) {
				System.err.println("Erro: Arquivo de recurso '" + resourcePath + "' não encontrado no classpath.");
				return;
			}
			
			try (Scanner sc = new Scanner(in)) {
				Map<Candidatos, Integer> votos = new HashMap<>();

				while (sc.hasNextLine()) {
					String[] linhas = sc.nextLine().split(",");
					String nome = linhas[0];
					Integer apurados = Integer.parseInt(linhas[1]);

					Candidatos candidatos = new Candidatos(nome, apurados);
					if (votos.containsKey(candidatos)) {
						votos.put(candidatos, votos.get(candidatos) + apurados);
					} else {
						votos.put(candidatos, apurados);
					}

				}
				System.out.println("=== Resultados ====");
				for (Candidatos can : votos.keySet()) {
					System.out.println(can + ", " + votos.get(can));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
