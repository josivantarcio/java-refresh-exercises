package nelioAlves.explicacao.model.entities;

public class ConcretePrinter extends Device implements Printer {

	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processDoc(String doc) {
		// TODO Auto-generated method stub
		System.out.println("Printer processing: " + doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}
}
