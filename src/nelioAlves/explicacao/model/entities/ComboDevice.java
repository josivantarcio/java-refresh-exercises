package nelioAlves.explicacao.model.entities;

public class ComboDevice extends Device implements Scanner , Printer{

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		// TODO Auto-generated method stub
		System.out.println("Combo printing => " + doc);
		
	}

	@Override
	public String scan() {
		// TODO Auto-generated method stub
		return "Combo Scan Result :)";
	}

	@Override
	public void processDoc(String doc) {
		// TODO Auto-generated method stub
		System.out.println("combo processing ");
		
	}
	
}
