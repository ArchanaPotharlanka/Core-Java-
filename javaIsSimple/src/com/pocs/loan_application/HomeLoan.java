package com.pocs.loan_application;

public class HomeLoan extends Loan {

	public static void HomeLoanDocInfo() {
		System.out.println("Your Documents have been verified ");
	}

	public static void main(String[] args) {
		HomeLoan hl = new HomeLoan();
		double cibil = hl.cibilScore();
		int age = hl.customerAge();
		String address = hl.getAddress();
		String name = hl.getName();
		double salary = hl.getSalary();
		if (age > 18 && cibil > 760 && salary > 100000 && hl.aadharValid() && hl.panValid() && hl.phoneValid()) {
			System.out.println("Mr / Mrs " + name + " Congratulations ! your Application is selected for Home Loan");
			System.out.println("**************************************************************************");
			HomeLoanDocInfo();
			System.out.println("Your address :" + address);
			System.out.println("Loan is sanctioned with the Rate of Interet of :" + hl.getROI());
		} else {
			System.out.println("Sorry your Home Loan got rejected ");
		}
	}

}
