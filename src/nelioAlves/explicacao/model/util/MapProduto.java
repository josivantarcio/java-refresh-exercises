package nelioAlves.explicacao.model.util;

import java.util.function.Function;

import nelioAlves.explicacao.model.entities.Produtos;

public class MapProduto implements Function<Produtos, String>{

	@Override
	public String apply(Produtos t) {
		
		return t.getNome().toUpperCase();
	}

}
