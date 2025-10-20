package nelioAlves.explicacao.model.entities;

import java.util.List;

public class CalcularMaior {

	public static <T extends Comparable<? super T>> T max(List<T> lista) {
		if (lista.isEmpty()) {
			throw new IllegalArgumentException("Valor nao permitido ");
		} else {
			T valor = lista.get(0);
			for (T i : lista) {
				if (i.compareTo(valor) > 0) {
					valor = i;
				}
			}
			return valor;
		}
	}
}
