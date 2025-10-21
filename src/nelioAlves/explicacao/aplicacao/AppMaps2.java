package nelioAlves.explicacao.aplicacao;

import java.util.HashMap;
import java.util.Map;

import nelioAlves.explicacao.model.entities.Produtos;

public class AppMaps2 {

	public static void main(String[] args) {

		Map<Produtos, Double> estoque = new HashMap<>();

		Produtos p1 = new Produtos("Mouse", 69.00);
		Produtos p2 = new Produtos("cadeira", 219.00);
		Produtos p3 = new Produtos("mamao", 16.10);

		estoque.put(p1, 211.0);
		estoque.put(p2, 67.);
		estoque.put(p3, 3.0);

		System.out.println("=== Produtos =====");
//		for (Produtos k : estoque.keySet()) {
//			System.out.println(estoque.containsKey(k));
//		}
		System.out.println(estoque.containsKey(p1) ? "Possui" : "Nao Possui");

	}
}
