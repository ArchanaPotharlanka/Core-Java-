package com.constructors;

import java.util.Scanner;

public class AtmPinValidation {
	long accNumber;
	int atmPin;
	double balance;
	Scanner sc = new Scanner(System.in);

	AtmPinValidation(long accNumber, int atmPin, double balance) {
		this.accNumber = accNumber;
		this.atmPin = atmPin;
		this.balance = balance;
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		AtmPinValidation a = new AtmPinValidation(987456321l, 1962, 720000);
		a.validatePin();

	}

	void validatePin() {
		System.out.println("Enter the pin : ");
		int pin = sc.nextInt();
		if (pin == atmPin) {
			withDraw();
		} else {
			System.out.println("Enter the valid pin !");
		}

	}

	void withDraw() {

		System.out.println("Enter the amount you want to withdraw !");
		double amount = sc.nextDouble();
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient funds ");
		}
		this.balance = balance;

		System.out.println("You wanna know your balance :");
		String check = sc.next();
		if (check.equals("yes")) {
			checkBalance();
		} else if (check.equals("no")) {
			System.out.println("Thank you for visiting !");
		}
	}

	void checkBalance() {
		System.out.println("Your current balance :" + balance);
	}

}
