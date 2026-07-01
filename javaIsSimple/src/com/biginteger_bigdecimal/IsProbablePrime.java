package com.biginteger_bigdecimal;

import java.util.Scanner;
import java.math.BigInteger;

public class IsProbablePrime {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check prime or not ?");
		String n = sc.next();
		BigInteger num = new BigInteger(n);
		boolean prime = isPrime(num);
		if (prime) {
			System.out.println(num + " is prime ");
		} else {
			System.out.println(num + " is not prime ");
		}
		sc.close();
	}

	static boolean isPrime(BigInteger n) {
		boolean flag = false;
		if (n.isProbablePrime(10)) {
			flag = true;
		}
		return flag;

	}

}
