package nelioAlves.exercicio.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import nelioAlves.explicacao.entities.enums.OrderStatus;

public class Order {

	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private LocalDateTime moment;
	private OrderStatus status;

	private Client client;

	private List<OrderItem> orderItens = new ArrayList<>();

	public Order() {
	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addOrderItem(OrderItem order) {
		orderItens.add(order);
	}

	public void removeOrderItem(OrderItem order) {
		orderItens.remove(order);
	}

	public double total() {
		double soma = 0.0;
		for (OrderItem item : orderItens) {
			soma += item.subTotal();
		}
		return soma;
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:" + "\n");
		sb.append("Order moment: " + dtf.format(getMoment()) + "\n");
		sb.append("Order Status: " + getStatus() + "\n");
		sb.append("Client: " + getClient().toString() + "\n");
		sb.append("Order items: \n");
		
		for (OrderItem o : orderItens) {
			sb.append(o.toString() + "\n");
		}
		System.out.println();
		sb.append("Total Price: $" + total());

		return sb.toString();
	}

}
