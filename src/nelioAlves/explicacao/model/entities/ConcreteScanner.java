package nelioAlves.explicacao.model.entities;

public class ConcreteScanner extends Device implements Scanner {

	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processDoc(String doc) {
		// TODO Auto-generated method stub
		System.out.println("Scanner processing " + doc);

	}

	@Override
	public String scan() {
		return "SCanned content - :)";
	}

}
