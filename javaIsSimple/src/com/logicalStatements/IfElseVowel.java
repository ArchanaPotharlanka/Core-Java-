package com.logicalStatements;

import java.util.Scanner;

public class IfElseVowel {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letter ");
		char c = sc.next().toLowerCase().charAt(0);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("It is a Vowel ");
		} else {
			System.out.println("It is snot a vowel ");
		}
	}

}
