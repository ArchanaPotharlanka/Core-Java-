package com.dsaproblems;

public class ReverseInteger {

	public static void main(String[] args) {
		int n = 85214;
		int num = reverse(n);
		System.out.println(num);
	}

	static int reverse(int n) {
		int a = 0;
		while (n != 0) {
			if (n > Integer.MAX_VALUE / 10 || n < Integer.MIN_VALUE) {
				return 0;
			}
			int lastDig = n % 10;
			n = n / 10;
			a = a * 10 + lastDig;

		}
		return a;
	}

}
