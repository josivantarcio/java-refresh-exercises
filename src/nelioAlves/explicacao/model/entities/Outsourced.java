package nelioAlves.explicacao.model.entities;

public final class Outsourced extends Employees{
	
	private Double additionalChange;

	public Outsourced(String name, Integer hours, Double valueHours, Double additionalChange) {
		super(name, hours, valueHours);
		this.additionalChange = additionalChange;
	}

	public Double getAdditionalChange() {
		return additionalChange;
	}

	public void setAdditionalChange(Double additionalChange) {
		this.additionalChange = additionalChange;
	}
	
	@Override
	public double calculoHoraTrabalhada() {
		return super.calculoHoraTrabalhada() + this.getAdditionalChange() * 1.1;
	}

}
