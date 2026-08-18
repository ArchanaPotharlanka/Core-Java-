package com.dsaproblems;

public class CountTheDigits {
	public static void main(String[] args) {
		int n = 1524630;
		int count = countDigit(n);
		System.out.println(count);

	}

	static int countDigit(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

}
