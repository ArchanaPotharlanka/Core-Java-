package com.operators;

public class TernaryMinimumOfThree {

	public static void main(String[] args) {
		System.out.println("main method started");
		int a = 20;
		int b = 10;
		int c = 12;
		int minimum = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
//		int minimum =(a<b)?((a<c)?a:c):((b<c)?b:c);
		System.out.println("Minimum of three :" + minimum);
	}

}
