package com.constructors;

class A {
	static void show() {
		System.out.println("Show method called ");
	}

	public static void main(String[] args) {

		System.out.println("main method started ");
	}
}

public class Sample extends A {

	public static void main(String[] args) {

		System.out.println("main method started ");
		show();
	}

	

}
