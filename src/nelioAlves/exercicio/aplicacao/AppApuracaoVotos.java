package nelioAlves.exercicio.aplicacao;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import nelioAlves.exercicio.model.entities.Candidatos;

public class AppApuracaoVotos {

	public static void main(String[] args) {

		Scanner sc = null;
		try (InputStream in = AppApuracaoVotos.class.getResourceAsStream("/urna001.txt")) {
			sc = new Scanner(in);

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
			for (Map.Entry<Candidatos, Integer> votosFinal : votos.entrySet()) {
				System.out.println(votosFinal.getKey().getNomeCandidato() + ": " + votosFinal.getValue());
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
