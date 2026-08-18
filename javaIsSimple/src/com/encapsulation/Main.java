package com.encapsulation;
class TestBankAccount {
// Can we achieve encapsulation without getters and setters? 


	private double balance = 1000;

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println(amount + " deposited successfully.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println(amount + " withdrawn successfully.");
		} else {
			System.out.println("Insufficient balance.");
		}
	}

	public void checkBalance() {
		System.out.println("Current Balance: " + balance);
	}
}

public class Main {
	public static void main(String[] args) {

		TestBankAccount account = new TestBankAccount();

		account.deposit(500);
		account.withdraw(200);
		account.checkBalance();

//		 account.balance = 5000; // Compile-time Error
	}
}