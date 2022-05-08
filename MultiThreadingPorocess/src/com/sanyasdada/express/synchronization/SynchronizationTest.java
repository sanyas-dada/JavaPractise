package com.sanyasdada.express.synchronization;


class Account {
	private int balance = 0;

	public Account(int balance) {
		this.balance = balance;
	}

	public void withdraw(int amount) {
		this.balance -= amount;
	}

	public void deposit(int amount) {
		this.balance += amount;
	}

	public int getBalance() {
		return this.balance;
	}
}

public class SynchronizationTest {
	public static void main(String[] args) {
		Bank bank = new Bank();
		for(int i =0; i<Bank.MAX_ACCOUNT;i++) {
			Thread t = new Thread(new Transaction(bank,i));
			t.start();
		}

	}

}
