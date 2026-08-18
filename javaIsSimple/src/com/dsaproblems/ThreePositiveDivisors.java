package com.dsaproblems;

//if a number has Exactly three positive Disiors - true
//otherwise -false

public class ThreePositiveDivisors {

	public static void main(String[] args) {
		int n = 4;
		boolean isTrue = isTrue(n);
		System.out.println(isTrue);
	}

	static boolean isTrue(int n) {
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 3) {
			return true;
		} else {
			return false;
		}

	}

}
