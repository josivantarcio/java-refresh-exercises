package nelioAlves.exercicio.entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		double tax = 0;
		if (super.getAnualIncome() > 20000) {
			tax = 0.25;
		} else {
			tax = 0.15;
		}

		return super.getAnualIncome() * tax - healthExpenditures * 0.5;
	}

}
