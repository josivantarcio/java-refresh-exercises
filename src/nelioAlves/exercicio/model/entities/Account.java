package nelioAlves.exercicio.model.entities;

import nelioAlves.exercicio.model.exceptions.DomainException;

public class Account {

	private final Integer number;
	private final String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(Double amount) throws DomainException {
		if (amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if (amount > balance) {
			throw new DomainException("Not enough balance");
		}
		balance -= amount;
	}

	@Override
	public String toString() {
		return "Account " + "\nnumber: " + number + ", holder: " + holder + ", balance: " + balance;
	}

}
