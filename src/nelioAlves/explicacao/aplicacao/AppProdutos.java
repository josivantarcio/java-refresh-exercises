package nelioAlves.explicacao.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import nelioAlves.explicacao.model.entities.Produtos;

public class AppProdutos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Produtos> prod = new ArrayList<>();

		prod.add(new Produtos("Xadrez", 310.50));
		prod.add(new Produtos("Mouse", 62.00));
		prod.add(new Produtos("Geladeira", 2500.00));
		prod.add(new Produtos("Panela", 29.60));
		prod.add(new Produtos("Caneta Bico-de-pena", 100.00));

		/*
		 * Estudando Predicate
		 */
		double min = 100.0;
		prod.removeIf(x -> x.getPreco() > min);
		// prod.removeIf(Produtos::produtoPredicadoMaior100);
		prod.forEach(System.out::println);
		System.out.println();

		/*
		 * Estudando Consume
		 */
		double factor = 1.1;
		System.out.println("Consume com mais 10%");
		// prod.forEach(Produtos::produtoConsumeMais10);
		prod.forEach(x -> x.setPreco(x.getPreco() * factor));
		prod.forEach(System.out::println);
		System.out.println();

		/*
		 * Estudando Funtion precisa ser criada uma nova lista para receber os ajustes
		 * (map).
		 * 
		 * PASSO A PASSO
		 * - primeiro deve converter a lista em stream();
		 * - depois que converter em stream, terá acesso ao map;
		 * - dentro do map, faça a logica que desejar, nesse caso, converteu para maiusculo os nomes;
		 * - depois de convertido, precisa voltar para lista. Daí o 'collect(Collectors.toList())';
		 * - por fim, como é criado uma nova lista, deve criar uma nova lista. no caso, uma lista de String;
		 */
		System.out.println("Lista de Nome em Caixa Alta:");
		// List<String> nomes = prod.stream().map(Produtos::produtoMapNomeMaiusculo).collect(Collectors.toList());
		// nomes.forEach(System.out::println);
		List<String> novaLista = prod.stream() 
				.map(p -> p.getNome().toUpperCase()) 
				.collect(Collectors.toList());
		novaLista.forEach(System.out::println);
	}
}
