package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestCollection3 {

	public static void main(String[] args) {

		List<String> courses = new ArrayList<>();
		courses.add("JavaScript");
		courses.add("Python");
		courses.add("SQL");
		courses.add("HTML");

		int index = courses.indexOf("Python");
		courses.add(index + 1, "Java");

//		for (int i = 0; i < courses.size(); i++) {
//			if (courses.get(i).equals("Python")) {
//				int n = courses.indexOf(courses.get(i));
//				courses.add(n + 1, "Java");
//			}
//
//		}

		System.out.println(courses);
	}

}
