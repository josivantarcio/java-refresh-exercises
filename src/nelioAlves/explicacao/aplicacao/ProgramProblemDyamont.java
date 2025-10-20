package nelioAlves.explicacao.aplicacao;

import nelioAlves.explicacao.model.entities.ComboDevice;
import nelioAlves.explicacao.model.entities.ConcretePrinter;
import nelioAlves.explicacao.model.entities.ConcreteScanner;

public class ProgramProblemDyamont {

	public static void main(String[] args) {

		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My letter");

		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());

		ComboDevice cd = new ComboDevice("208115");
		cd.processDoc("My dissetetion");
		cd.print("My dissetation :P");
		System.out.println(cd.scan());
	}
}
