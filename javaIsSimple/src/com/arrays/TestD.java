package com.arrays;

public class TestD {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };

		for (int x : arr) {
			x = x * 10;
		}
		for (int x : arr) {
			System.out.print(x);
		}

	}

}
