package nelioAlves.exercicio.model.entities;

public class Produto {

	private String nome;
	private Double preco;
	private Double quantidade;

	public Produto(String nome, Double preco, Double quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
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

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double total() {
		return getQuantidade() * getPreco();
	}

	@Override
	public String toString() {
		return nome + ", " + String.format("%.2f", total());
	}

}
