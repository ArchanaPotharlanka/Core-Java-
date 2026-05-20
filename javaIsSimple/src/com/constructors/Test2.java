package com.constructors;

public class Test2 {
	double deposit;
	double withdraw;

	Test2(double deposit, double withdraw) {
		this.deposit = deposit;
		this.withdraw = withdraw;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Test2 t = new Test2(3000.0, 4000.0);
		Test2 t1 = new Test2(5000.0, 6000.0);

		System.out.println(t.deposit = 7000.0);
		System.out.println(t1.deposit);

	}

}
