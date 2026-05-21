package com.arrays;

public class CountEvenOdd {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int numbers[] = { 12, 45, 85, 52, 36, 92, 73, 46, 84, 91, 90, 20, 31 };
		int even[] = new int[numbers.length];
		int odd[] = new int[numbers.length];
		System.out.println("Total Numbers :" + numbers.length);
//		k and l is to count the even and odd numbers :
		int k = 0;
		int l = 0;
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
			if (numbers[i] % 2 == 0) {
				even[k] = numbers[i];
				k++;

			} else {
				odd[l] = numbers[i];
				l++;
				;
			}
		}
		System.out.println();
		System.out.println("*************************");
//		printing Even array:
		System.out.println("Array of even numbers :");
		for (int i = 0; i < k; i++) {
			System.out.print(even[i] + " ");
		}
		System.out.println();
		System.out.println("Even numbers count :" + k);
		System.out.println("*************************");
//		Printing Odd array:
		System.out.println("Array of Odd numbers :");
		for (int i = 0; i < l; i++) {
			System.out.print(odd[i] + " ");
		}
		System.out.println();
		System.out.println("Odd numbers count :" + l);

	}

}
