package com.encapsulation;

public class BankAccount {

	private long accNum;
	private String accHolder;
	private double accBal;

	public BankAccount() {
		System.out.println("NO-ARG constructor called ");
	}

	public BankAccount(int accNum, String accHolder, double accBal) {
		this.accBal = accBal;
		this.accHolder = accHolder;
		this.accNum = accNum;

	}

	void setAccNum(long accNum) {

		if (accNum > 0) {
			this.accNum = accNum;
		} else {
			System.out.println("Invalid account number ");
		}
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccBal(double accBal) {
		if (accBal > 0) {
			this.accBal = accBal;
		} else {
			System.out.println("Invalid balance");
		}
	}

	void deposit(double bal) {
		if (bal > 0) {
			accBal += bal;
		} else {
			System.out.println("Invalid Deposit Amount");
		}
	}

	void withDraw(double bal) {
		if (bal > 0) {
			if (accBal >= bal) {
				accBal -= bal;

			}
		}

	}

	public double getBal() {
		return accBal;
	}

}
