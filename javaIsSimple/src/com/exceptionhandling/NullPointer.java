package com.exceptionhandling;

public class NullPointer {

	public static void main(String[] args) {
		System.out.println("main method started ");
		String s = null;
		try {
			System.out.println(s.length());
		}

		catch (NullPointerException npe) {
			npe.printStackTrace();
			System.out.println("************************");
			System.out.println(npe.getMessage());
			System.out.println("*************************");
			System.out.println(npe.getCause());

		}
		System.out.println("Main method ended ");
		System.out.println("Main method ended ");
	}

}
