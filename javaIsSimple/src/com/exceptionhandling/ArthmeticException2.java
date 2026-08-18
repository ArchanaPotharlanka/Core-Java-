package com.exceptionhandling;

public class ArthmeticException2 {
	public static void main(String[] args) {
		System.out.println("main method started ");
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (Exception e) {
//			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
//			System.err.println("Exception occured");
		}

	}

}
