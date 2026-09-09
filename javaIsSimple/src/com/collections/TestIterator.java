package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Collection<String> c1 = new ArrayList<>();
		c1.add("Ramesh");
		c1.add("kiran");
		c1.add("prabhas");
		c1.add("siva");
		c1.add("Rasool");
		System.out.println(c1);

		Collection<String> c2 = new ArrayList<>();
		c2.add("Archana");
		c2.add("Harika");
		c2.add("Koti");
		c2.add("Thanmai");
		c2.add("Kouser");
		System.out.println(c2);
		Collection<String> c3 = new ArrayList<>();
		c3.addAll(c1);
		c3.addAll(c2);
		System.out.println(c3);
		Iterator<String> itr = c3.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		for (String each : c3) {
			System.out.println(each);
		}
		Object[] obj = c3.toArray();
		System.out.println("*******************");
		for (int i = 0; i < c3.size(); i++) {
			System.out.println(obj[i]);

		}

	}

}
