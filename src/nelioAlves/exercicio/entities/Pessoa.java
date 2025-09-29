package nelioAlves.exercicio.entities;

public class Pessoa {

	private String name;
	private int yearOld;
	private double high;
	private char genero;

	public Pessoa(String name, int yearOld, double high) {
		this.name = name;
		this.yearOld = yearOld;
		this.high = high;
	}

	public Pessoa(String name, int yearOld) {
		this.name = name;
		this.yearOld = yearOld;
	}

	public Pessoa(double high, char genero) {
		super();
		this.high = high;
		this.genero = genero;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOld() {
		return yearOld;
	}

	public void setYearOld(int yearOld) {
		this.yearOld = yearOld;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

}
