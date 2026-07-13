package com.arrays;

public class Leader {
	public static void main(String[] args) {
		System.out.println("Start small. Ship something.");
		int[] arr = { 16, 17, 4, 3, 5, 2 };

		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			int j = i + 1;
			while (j < arr.length) {
				if (arr[i] < arr[j]) {
					flag = false;
					break;
				}
				j++;

			}
			if (flag) {
				System.out.println(arr[i]);
			}
		}
	}
}
