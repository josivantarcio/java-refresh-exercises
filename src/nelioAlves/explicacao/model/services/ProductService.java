package nelioAlves.explicacao.model.services;

import java.util.List;
import java.util.function.Predicate;

import nelioAlves.explicacao.model.entities.Produtos;

public class ProductService {

	public double FilterSum(List<Produtos> prod, Predicate<Produtos> criterio) {
		double sum = 0.0;
		for (Produtos p : prod) {
			if (criterio.test(p)) {
				sum += p.getPreco();
			}
		}

		return sum;
	}

}
