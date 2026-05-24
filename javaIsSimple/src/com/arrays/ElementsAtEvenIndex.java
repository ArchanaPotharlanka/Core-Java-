package com.arrays;

public class ElementsAtEvenIndex {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] elements = { 9, 8, 7, 5, 2, 3, 4, 1, 10, 3, 6, 19 };
		System.out.println("Elements at Even index :");
		for (int i = 0; i < elements.length; i++) {
			if (i % 2 == 0) {
				System.out.print(elements[i]+" ");
			}
		}
	}

}
