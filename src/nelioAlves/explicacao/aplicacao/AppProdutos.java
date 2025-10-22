package nelioAlves.explicacao.aplicacao;

import java.util.ArrayList;
import java.util.List;

import nelioAlves.explicacao.model.entities.Produtos;

public class AppProdutos {
	public static void main(String[] args) {

		List<Produtos> prod = new ArrayList<>();

		prod.add(new Produtos("Xadrez", 310.50));
		prod.add(new Produtos("Mouse", 62.00));
		prod.add(new Produtos("Geladeira", 2500.0));
		prod.add(new Produtos("Panela", 29.60));

		prod.sort((prod1, prod2) -> prod1.getNome().compareTo(prod2.getNome()));

		for (Produtos p : prod) {
			System.out.println(p);
		}

	}
}
