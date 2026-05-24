package com.arrays;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] elements = { 1, 2, 5, 6, 3, 4, 8, 95, 10, 44, 52, 96, 85, 20, 11 };
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number you want to search :");
		int num = sc.nextInt();
		boolean found = false;

		for (int i = 0; i < elements.length; i++) {
			if (num == elements[i]) {
				System.out.println("Elements found at inder :" + i);
				found = true;
				break;
			}
		}
		if (found ==false) {
			System.out.println("Element not found ");
		}
	}
}
