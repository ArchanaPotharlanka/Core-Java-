package com.exceptionhandling;

public class TestDemo {

	public static void main(String[] args) {
		System.out.println("main method started ");
		try {
			System.out.println("A");
			return;
		} finally {
			System.out.println("B");
		}	
//		System.out.println("main method ended");//Unreachable code
	}

}
