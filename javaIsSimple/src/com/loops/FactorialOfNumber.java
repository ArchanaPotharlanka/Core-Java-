package com.loops;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find the factorial ?");
		int n = sc.nextInt();
		findFact(n);
		sc.close();
	}

	static void findFact(int n) {
//		int fact=1;
//		fact=fact*i;
//		BigInteger fact = BigInteger.ONE;
		BigInteger fact = new BigInteger("1");
		System.out.println(fact);
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println("Factorial of " + n + " is " + fact);
	}

}
