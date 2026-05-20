package com.constructors;

import java.util.Scanner;

public class StudentLoginSystem {
	String userName;
	String password;

	StudentLoginSystem(String userName, String password) {
		this.userName = userName;
		this.password = password;

	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		StudentLoginSystem s = new StudentLoginSystem("Archana", "Nagraj@1962");

		s.login();
		System.out.println("main method ended ");

	}

	void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User Name : ");
		String uname = sc.next();
		System.out.println("Enter the password : ");
		String pword = sc.next();

		if (uname.equals(userName)  && pword .equals(password)) {
			System.out.println("Login Successful !");
		} else {
			System.out.println("oops!Invalid credentials ");
		}
		sc.close();

	}

}
