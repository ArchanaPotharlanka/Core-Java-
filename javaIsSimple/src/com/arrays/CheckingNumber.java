package com.arrays;

import java.util.Scanner;

public class CheckingNumber {
//Check whether array contains a specific number.
	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 2 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search");
		int num = sc.nextInt();
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println("element found at index : " + i);
				found = true;
			} else {

			}

		}
		if (found == false) {
			System.out.println("The element not found ");
		}

	}

}
