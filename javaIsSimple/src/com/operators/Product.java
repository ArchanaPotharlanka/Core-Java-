package com.operators;

import java.util.Scanner;

public class Product {
	static int currentStock = 250;

	public static void main(String[] args) {
		System.out.println("Main method started ");

		System.out.println("Current stock is :" + currentStock);
		Scanner sc = new Scanner(System.in);
		System.out.println("How many items sold");
		int soldItems = sc.nextInt();
		currentStock -= soldItems;
		System.out.println("How many items are damaged");
		int damaged = sc.nextInt();
		currentStock -= damaged;
		System.out.println("How many units of New Shipment added");
		int newShipment = sc.nextInt();

		int finalStock = currentStock + newShipment;
		System.out.println("Final stock :" + finalStock);
	}

}
