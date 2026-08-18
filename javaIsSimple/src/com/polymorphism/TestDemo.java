package com.polymorphism;

public class TestDemo {
	void main(String[] args) {
		System.out.println("main method started ");
		TestDemo t = new TestDemo();
		add(10, 20);
		add(10, 20, 30);
		add(10, 20, 30, 40);

	}

	void add(int... values) {
		int sum = 0;
		for (int i : values) {
			sum = sum + i;
		}
		System.out.println("Sum :" + sum);

	}

}
