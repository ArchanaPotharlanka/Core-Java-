package com.biginteger_bigdecimal;

import java.math.BigInteger;
import java.util.Scanner;

public class CompareTo {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number :");
		String firstNumber = sc.next();
		System.out.println("Enter the second Number :");
		String secondNumber = sc.next();
		BigInteger a = new BigInteger(firstNumber);
		BigInteger b = new BigInteger(secondNumber);
		int result = compareTo(a, b);
		if (result < 0) {
			System.out.println(a + " is smaller ");
		} else if (result == 0) {
			System.out.println(a + " and " + b + " are  equal ");
		} else {
			System.out.println(a + " is greater");
		}
		sc.close();
	}

	static int compareTo(BigInteger a, BigInteger b) {//it returns three values 0,-1,1
		int result = a.compareTo(b);
		return result;

	}

}
