package com.constructors;

import java.util.Scanner;

public class ShoppingCart {
	int productId;
	String productName;
	double productPrice;
	int quantity;
	double totalBill;
	static Scanner sc = new Scanner(System.in);

	public ShoppingCart(int productId, String productName, double productPrice, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;

	}

	public static void main(String[] args) {
		System.out.println("Main method started ");
		ShoppingCart s = new ShoppingCart(101, "Laptop", 80000.0, 8);
		s.calculateBill();
		s.applyDiscount();
		s.addMoreItems();
		s.displayProductDetails();

	}

	void calculateBill() {
		double bill = quantity * productPrice;
		this.totalBill = bill;
		System.out.println(totalBill);

	}

	void applyDiscount() {
		if (totalBill > 500000) {
			totalBill -= (totalBill * 10) / 100;
		} else if (totalBill > 400000) {
			totalBill -= (totalBill * 5) / 100;
		} else {

		}

		System.out.println("Total bill with discount :" + totalBill);
	}

	void addMoreItems() {
		System.out.println("Enter the number you want to add ?");
		int num = sc.nextInt();
		quantity += num;
		totalBill = productPrice * quantity;
		System.out.println("Updated Bill after adding items : " + totalBill);
		applyDiscount();
		

	}

	void displayProductDetails() {
		System.out.println("Product Id : " + productId);
		System.out.println("productName : " + productName);
		System.out.println("productPrice : " + productPrice);
		System.out.println("Quantity : " + quantity);
		System.out.println("Final Bill :" + totalBill);

	}
}
