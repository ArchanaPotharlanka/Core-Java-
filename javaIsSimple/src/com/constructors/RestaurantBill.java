package com.constructors;

public class RestaurantBill {
	String customerName;
	String foodItem;
	int quantity;
	double price;

	public RestaurantBill(String customerName, String foodItem) {
		this.customerName = customerName;
		this.foodItem = foodItem;

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		RestaurantBill r1 = new RestaurantBill("Archana", "Biryani");
		r1.calculateBill(2, 200);

		RestaurantBill r2 = new RestaurantBill("Thanmai", "Idly");
		r2.calculateBill(5, 50);
		
		RestaurantBill r3 = new RestaurantBill("Harika", "Dosa");
		r3.calculateBill(3, 50);

	}

	void calculateBill(int quantity, double price) {

		System.out.println("******************************");
		double totalBill = quantity * price;
		System.out.println("CustomerName : " + customerName);
		System.out.println("FoodItem : " + foodItem);
		System.out.println("Quantity : " + quantity);
		System.out.println("Price of each  :" + price);
		System.out.println("Total Bill :" + totalBill);
	}

}
