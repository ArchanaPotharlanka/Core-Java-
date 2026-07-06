package com.arrays;

import java.util.Scanner;

public class PrefixSumArray {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements to the array :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = 0;
		int[] pa = new int[n];
		for (int i = 0; i < n; i++) {
			int prefixSum = 0;
			for (int j = 0; j <=i; j++) {
				prefixSum += arr[j];
			}
			pa[k++] = prefixSum;

		}
		for (int i = 0; i < k; i++) {
			System.out.print(pa[i]+" ");
		}
	}

}
