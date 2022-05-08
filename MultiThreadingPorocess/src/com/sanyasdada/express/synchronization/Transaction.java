package com.sanyasdada.express.synchronization;

public class Transaction implements Runnable {
	private Bank bank;
	private int fromAccount;

	public Transaction(Bank bank, int fromAccount) {
		this.bank = bank;
		this.fromAccount = fromAccount;
		System.out.println("Transaction construtor is called");

	}

	public void run() {
		while (true) {
			System.out.println("run method is calleed");
			
			int toAccount = (int) (Math.random() * Bank.MAX_ACCOUNT);
			if (toAccount == fromAccount) {
				continue;
			}
			int amount = (int) (Math.random() * Bank.MAX_ACCOUNT);
			if (amount == 0) {
				continue;
			}
			bank.transfer(fromAccount, toAccount, amount);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}

	}

}
