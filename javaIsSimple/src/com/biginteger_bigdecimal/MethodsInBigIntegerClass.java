package com.biginteger_bigdecimal;

import java.math.BigInteger;;

public class MethodsInBigIntegerClass {

	public static void main(String[] args) {
		System.out.println("main method started ");
		BigInteger a = new BigInteger("9875632566");
		BigInteger b = new BigInteger("8756328566");
		max(a, b);
		min(a, b);
		abs();
		gcd(a, b);
		pow(a, b);
		negate(a);
		and(a, b);
		mod(a, b);

	}

	static void max(BigInteger a, BigInteger b) {
		System.out.println("Maximum Number :" + a.max(b));
	}

	static void min(BigInteger a, BigInteger b) {
		System.out.println("Minimum Number :" + a.min(b));
	}

	static void abs() {
		BigInteger n = new BigInteger("-9874698125586");
		System.out.println("******************************");
		System.out.println("Original :" + n);
		System.out.println("Absolute value :" + n.abs());

	}

	static void gcd(BigInteger a, BigInteger b) {
		System.out.println("GCD :" + a.gcd(b));

	}

	static void pow(BigInteger a, BigInteger b) {
		System.out.println("Power of " + a + " is " + a.pow(5));

	}

	static void negate(BigInteger a) {
		System.out.println("Negative value of " + a + " is " + a.negate());

	}

	static void and(BigInteger a, BigInteger b) {
		System.out.println(a.and(b));
	}

	static void mod(BigInteger a, BigInteger b) {
		System.out.println(a.mod(b));
	}
}
