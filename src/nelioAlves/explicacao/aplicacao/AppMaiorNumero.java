package nelioAlves.explicacao.aplicacao;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import nelioAlves.explicacao.model.entities.CalcularMaior;
import nelioAlves.explicacao.model.entities.Products;

public class AppMaiorNumero {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Products> listaProdutos = new ArrayList<>();

		try (InputStream in = AppMaiorNumero.class.getResourceAsStream("/prod.txt");
				BufferedReader br = new BufferedReader(new InputStreamReader(in))) {

			String line = br.readLine();

			while (line != null) {
				if (!line.trim().isEmpty()) {
					String[] fields = line.split(",");
					String nome = fields[0].trim();
					Double preco = Double.parseDouble(fields[1].trim());
					listaProdutos.add(new Products(nome, preco));
				}
				line = br.readLine();
			}

			Products maximo = CalcularMaior.max(listaProdutos);
			System.out.println("Produto mais caro: " + maximo.getName() + " - " + maximo.getPrice());

		} catch (NullPointerException e) {
			System.out.println("Arquivo 'prod.txt' não encontrado no classpath!");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
