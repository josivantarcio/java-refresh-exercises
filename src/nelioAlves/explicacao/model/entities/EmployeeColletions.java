package nelioAlves.explicacao.model.entities;

public class EmployeeColletions implements Comparable<EmployeeColletions>{

	private String name;
	private Double salary;

	public EmployeeColletions(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", salary);
	}

	@Override
	public int compareTo(EmployeeColletions o) {
		return name.compareTo(o.getName());
	}

}
