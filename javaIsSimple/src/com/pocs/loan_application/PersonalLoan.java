package com.pocs.loan_application;

public class PersonalLoan extends Loan {

	public static void PersonalLoanDocInfo() {
		System.out.println("Your Documents Have been verified ");
	}

	public static void main(String[] args) {
		PersonalLoan pl = new PersonalLoan();
		double cibil = pl.cibilScore();
		int age = pl.customerAge();
		String name = pl.getName();
		double salary = pl.getSalary();
		String address = pl.getAddress();

		if (age > 18 && salary > 1000000 && cibil > 760 && pl.aadharValid() && pl.panValid() && pl.phoneValid()) {
			System.out.println("Mr/Mrs " + name + " - Congratulations Your Personal loan got Approved  ");
			System.out.println("*******************************************************************");
			PersonalLoanDocInfo();
			System.out.println("check your Address :" + address);

			System.out.println("Loan is sanctioned with the Rate of Interest " + pl.getROI());

		} else {
			System.out.println("Sorry ! Your personal Loan got rejected ");
		}

	}

	

}
