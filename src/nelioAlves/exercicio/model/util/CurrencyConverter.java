package nelioAlves.exercicio.model.util;

public class CurrencyConverter {
	
	public static double calcularDollar(double dollar, double real) {
		double iof = dollar * real * 0.06;
		return (dollar * real) + iof;
	}
}
