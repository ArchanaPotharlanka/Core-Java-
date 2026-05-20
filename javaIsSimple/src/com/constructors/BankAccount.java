package com.constructors;

public class BankAccount {
	long accNum;
	String holderName;
	double bal;
	String branchName;

	BankAccount(long accNum, String holderName, double bal, String branchName) {

		this.accNum = accNum;
		this.holderName = holderName;
		this.bal = bal;
		this.branchName = branchName;

	}

	public static void main(String[] args) {
		System.out.println("Main method started ");
		BankAccount b = new BankAccount(789456212l, "Archana", 80000.00, "Nandigama");
		b.deposit(20000.0);
		System.out.println("*************************");
		b.withDraw(30000);
		b.displayAccountDetails();
	}

	void deposit(double amount) {
		bal += amount;
		System.out.println(amount + " Deposited successfully ");
		System.out.println("Current balanace :" + bal);

	}

	void withDraw(double amount) {
		if (amount <=bal) {
			bal -= amount;
		} else {
			System.out.println("Insufficient bank balance ");
		}
		System.out.println(amount + " Withdrawed Successfully ");
		System.out.println("Current balance : " + bal);
	}

	void displayAccountDetails() {
		System.out.println("*********************");
		System.out.println("Acccount number :" + accNum);
		System.out.println("Account Holder Name :" + holderName);
		System.out.println("Account Balance :" + bal);
		System.out.println("Branch Name :" + branchName);
	}

}
