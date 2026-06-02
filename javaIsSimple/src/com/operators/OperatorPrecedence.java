package com.operators;

public class OperatorPrecedence {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int a = 10;
		int b = 20;
		int c = 30;
		int d = a * c / b - a + b;// 10*30/20-10+20
		System.out.println(d);
	}

}
