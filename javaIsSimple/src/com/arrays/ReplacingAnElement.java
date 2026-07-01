package com.arrays;

public class ReplacingAnElement {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 88, 9 };
		System.out.println("Before Replacing ");
		for (int e : arr) {
			System.out.print(e + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == 7) {
				arr[i] = 8;
			}
		}
		System.out.println();
		System.out.println("After Replacing ");
		for (int e : arr) {
			System.out.print(e + " ");
		}
	}

}
