package nelioAlves.exercicio.entities;

public class Correntista {

	private String name;
	private Integer numConta;
	private double saldo;
	private final double TAX = 5.0;

	public Correntista(String name, Integer numConta, double inicialDeposito) {
		this.name = name;
		this.numConta = numConta;
		depositarValor(inicialDeposito);
	}

	public Correntista(String name, Integer numConta) {
		this.name = name;
		this.numConta = numConta;
		this.saldo = 0;
	}

	public void saque(double saqueValor) {

		this.saldo -= saqueValor + TAX;
	}

	public void depositarValor(double depositar) {

		this.saldo += depositar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public Double getDeposito() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Correntista Nome: " + getName() + ", Conta:" + getNumConta() + ", Saldo:" + getDeposito();
	}

}
