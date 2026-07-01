package com.logicalStatements;

import java.util.Scanner;

public class ElseIfFoodDeliveryDiscount {

	public static void main(String[] args) {
		System.out.println("Food Delivery Discount ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total bill");
		double bill = sc.nextDouble();
		double discount;
		if (bill > 5000) {
			System.out.println("Total bill :" + bill);
			System.out.println("You will get 25% Discount on your bill ");
			discount = 25.0 / 100 * bill;
			bill -= discount;
			System.out.println("Bill with Discount :" + bill);
		} else if (bill > 3000) {
			System.out.println("Total bill :" + bill);
			System.out.println("You will get 15% Discount on your bill");
			discount = 15.0 / 100 * bill;
			bill -= discount;
			System.out.println("Bill with discount :" + bill);

		} else if (bill > 1000) {
			System.out.println("Total bill :"+bill);
			System.out.println();
		}
	}

}
