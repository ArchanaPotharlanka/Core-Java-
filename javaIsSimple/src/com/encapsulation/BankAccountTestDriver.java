package com.encapsulation;

public class BankAccountTestDriver {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		BankAccount ba1 = new BankAccount(789644122, "ARchana", 8512.00);
		ba1.setAccBal(789255545);
		ba1.setAccHolder("Ramesh");
		ba1.setAccBal(95000.00);
		ba1.deposit(0.00);
		ba1.withDraw(2000);
		System.out.println(ba1.getAccNum());
		System.out.println(ba1.getAccHolder());
		System.out.println(ba1.getBal());

	}

}
