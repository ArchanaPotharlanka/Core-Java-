package com.loops;

import java.util.Scanner;

public class primeNumbersBetweenRange {
	static int sum = 0;

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start range?");
		int n1 = sc.nextInt();
		System.out.println("Enter the end range ?");
		int n2 = sc.nextInt();

		for (int i = n1; i <= n2; i++) {
			if (prime(i)) {
				System.out.print(i + " ");
				sum += i;
			}

		}
		System.out.println();
		System.out.println("Sum of prime numbers:" + sum);
		sc.close();
	}

	static boolean prime(int n) {
		boolean status = true;
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;

	}

}
