package com.collections;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {

	public static void main(String[] args) {
		System.out.println("Main method started");
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		for (int i = 0; i < list.size(); i++) {
			int n = list.get(i);
			if (n % 2 == 0) {
				System.out.println(n);

			}
		}

	}

}
