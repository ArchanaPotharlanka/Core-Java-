package com.arrays;

public class CountOfPositive {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] totalNumbers = { -8, 9, 2, 5, -6, -2, -9, 2, -5 };
		int[] positiveArray = new int[totalNumbers.length];
		int[] negativeArray = new int[totalNumbers.length];
		int pc = 0; // pc=positive count
		int nc = 0; // nc=negative count
		for (int i = 0; i < totalNumbers.length; i++) {
			if (totalNumbers[i] > 0) {
				positiveArray[pc] = totalNumbers[i];
				pc++;
			} else if (totalNumbers[i] < 0) {
				negativeArray[nc] = totalNumbers[i];
				nc++;
			}
		}
		System.out.println("Postive array :");
		for (int i = 0; i < pc; i++) {
			System.out.print(positiveArray[i] + " ");
		}

		System.out.println();

		System.out.println("*******************");
		System.out.println("Negative aray :");
		for (int j = 0; j < nc; j++) {
			System.out.print(negativeArray[j] + " ");
		}
	}

}
