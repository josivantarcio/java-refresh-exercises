package nelioAlves.explicacao.entities;

public class Employees {

	private String name;
	private Integer hours;
	private Double valueHours;

	public Employees() {
	}

	public Employees(String name, Integer hours, Double valueHours) {
		this.name = name;
		this.hours = hours;
		this.valueHours = valueHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValueHours() {
		return valueHours;
	}

	public void setValueHours(Double valueHours) {
		this.valueHours = valueHours;
	}
	
	public double calculoHoraTrabalhada() {
		return getHours() * getValueHours();
	}

	@Override
	public String toString() {
		return name + " $ " + calculoHoraTrabalhada();
	}
	
	

}
