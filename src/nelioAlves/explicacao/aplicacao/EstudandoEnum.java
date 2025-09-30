package nelioAlves.explicacao.aplicacao;

import java.util.Date;

import nelioAlves.explicacao.model.entities.Order;
import nelioAlves.explicacao.model.enums.OrderStatus;

public class EstudandoEnum {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);

		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os2);
		System.out.println(os1);

	}

}
