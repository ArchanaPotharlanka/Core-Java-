package com.biginteger_bigdecimal;

import java.util.Scanner;
import java.math.BigInteger;

//Finding factorial of a given number? 
public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find the facctorial ?");
		int n = sc.nextInt();
		BigInteger factorial = findFact(n);
		System.out.println("Factorial of " + n + " is : " + factorial);
		sc.close();

	}

	static BigInteger findFact(int n) {

//		BigInteger fact = BigInteger.ONE;
		BigInteger fact = BigInteger.valueOf(1);
//		BigInteger fact = new BigInteger("1");// it is unnecessary for small values . It creates object.
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));

		}

		return fact;
	}

}
