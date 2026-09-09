package com.collections;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {

		System.out.println("Main method started");
		List<Integer> li = new ArrayList<>();

		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		li.add(7);
		li.add(9);
		li.add(10);

		for (int i = 0; i < li.size(); i++) {
			int n = li.get(i);
			if (n != i + 1) {
				System.out.println(i+1);
				break;
			}

		}

//		for (int i = 0; i < li.size() 
//		- 1; i++) {
//			int n = li.get(i);
//			int m = li.get(i + 1);
//			if ((m - n) > 1) {
//				System.out.println((m + n) / 2);
//
//			}
//
//		}

	}

}
