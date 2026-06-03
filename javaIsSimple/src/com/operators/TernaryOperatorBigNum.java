package com.operators;

public class TernaryOperatorBigNum {

	public static void main(String[] args) {
		System.out.println("main  method started ");

		int a = 10;
		int b = 15;
		int c = 20;
		int max = a > b ? (a > c ? a : c) : ((b > c) ? b : c);
		System.out.println(max);

	}

}
