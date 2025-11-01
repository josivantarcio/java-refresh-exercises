package nelioAlves.explicacao.model.entities;

public class Produtos {

	private String nome;
	private Double preco;

	public Produtos(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public static boolean produtoPredicadoMaior100(Produtos p) {
		return p.preco > 100.0;
	}

	public static void produtoConsumeMais10(Produtos p) {
		p.setPreco(p.getPreco() * 1.1);
	}
	
	public static String produtoMapNomeMaiusculo(Produtos p) {
		return p.getNome().toUpperCase();
	}

	@Override
	public String toString() {
		return nome + ", " + String.format("%.2f", preco);
	}

}
