package com.loops;

import java.util.Arrays;

//Write a Java program to find the frequency of each digit in a given number.
public class FrequencyOfDigit {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int num = 451225236;
		int j = 0;
		int[] arr = new int[10];
		while (num != 0) {
			int rem = num % 10;
			num = num / 10;
			arr[j++] = rem;

		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int k = 0; k < arr.length; k++) {
				if (arr[i] == arr[k]) {
					count++;

				}
			}
			System.out.println("Count of " + i + " is " + (count - 1));

		}

	}

}
