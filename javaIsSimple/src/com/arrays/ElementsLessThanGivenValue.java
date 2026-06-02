package com.arrays;

import java.util.Scanner;
//Print all elements less than a given value.
public class ElementsLessThanGivenValue {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int arr[] = { 99, 85, 25, 64, 84, 69, 96, 93, 92, 81 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element");
		int e = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < e) {
				System.out.print(arr[i] + " ");

			}
		}
	}

}
