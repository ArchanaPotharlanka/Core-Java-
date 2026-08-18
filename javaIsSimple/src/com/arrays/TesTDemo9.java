package com.arrays;

import java.util.Scanner;
import java.util.Stack;

public class TesTDemo9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Encoded String");
		String s = sc.nextLine();

		Stack<Integer> countStack = new Stack<>();
		Stack<StringBuilder> stringStack = new Stack<>();

		StringBuilder current = new StringBuilder();
		int num = 0;

		for (char ch : s.toCharArray()) {

			if (Character.isDigit(ch)) {
				num = num * 10 + (ch - '0');
			} else if (ch == '[') {
				countStack.push(num);
				stringStack.push(current);

				current = new StringBuilder();
				num = 0;
			} else if (ch == ']') {
				int repeat = countStack.pop();
				StringBuilder prev = stringStack.pop();

				for (int i = 0; i < repeat; i++) {
					prev.append(current);
				}

				current = prev;
			} else {
				current.append(ch);
			}
		}

		System.out.println(current);

		
		sc.close();
	}
}