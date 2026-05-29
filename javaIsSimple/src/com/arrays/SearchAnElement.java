package com.arrays;

import java.util.Scanner;

public class SearchAnElement {

	public static void main(String[] args) {
		System.out.println("Searching an element");
		int[] array = { 10, 5, 3, 2, 8, 1, 4, 8, 9 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search ");
		int se = sc.nextInt();
		boolean found = false;
		for (int i = 0; i < array.length; i++) {
			if (se == array[i]) {

				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Element found ");
		} else {
			System.out.println("Element not found");
		}
	}

}
