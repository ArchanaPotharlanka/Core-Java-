package com.patterns;

public class Pattern3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 0 || j == 2) {
					System.out.print("*");

				} else {
					System.out.print("#");
				}
			}

			System.out.println();
		}
	}

}
