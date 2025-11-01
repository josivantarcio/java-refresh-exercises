package nelioAlves.explicacao.model.util;

import java.util.function.Consumer;

import nelioAlves.explicacao.model.entities.Produtos;

public class ConsumeProduto implements Consumer<Produtos> {

	@Override
	public void accept(Produtos t) {
		t.setPreco(t.getPreco() * 1.1);

	}

}
