package com.biginteger_bigdecimal;

import java.math.BigInteger;

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("Main method started ");
		BigInteger a = new BigInteger("987456321333");
		BigInteger b = new BigInteger("123654789636");
		sum(a, b);
		subtract(a, b);
		multiply(a, b);
		divideAndRemainder(a, b);

	}

	static void sum(BigInteger a, BigInteger b) {
		BigInteger sum = a.add(b);
		System.out.println("Sum :" + sum);

	}

	static void subtract(BigInteger a, BigInteger b) {
		BigInteger sub = a.subtract(b);
		System.out.println("Subtract :" + sub);
	}

	static void multiply(BigInteger a, BigInteger b) {
		BigInteger multiply = a.multiply(b);
		System.out.println("Multiplication :" + multiply);
	}

	static void divideAndRemainder(BigInteger a, BigInteger b) {
		BigInteger divide = a.divide(b);
		System.out.println("Division :" + divide);
		BigInteger remainder = a.remainder(b);
		System.out.println("Remainder :" + remainder);
	}

}
