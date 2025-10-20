package nelioAlves.explicacao.aplicacao;

import nelioAlves.explicacao.model.entities.AbstractShape;
import nelioAlves.explicacao.model.entities.Circle;
import nelioAlves.explicacao.model.entities.Rectangle;
import nelioAlves.explicacao.model.enums.Color;

public class App173 {

	public static void main(String[] args) {

		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle Area: " + s1.area());
		System.out.println("Rectangle: " + s2.getColor());
		System.out.println("Ractangle Area: " + s2.area());

	}

}
