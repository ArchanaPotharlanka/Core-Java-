package com.inheritance;

class Parent {
	void method1() {
		System.out.println("method 1 called from parent");

	}

}

public class TestClass extends Parent {
	void method2() {
		System.out.println("method 2 called from Child class");

	}

	public static void main(String[] args) {
		// By using child class child reference we can call the parent class
		// functionalities as well as child class functionalities
		TestClass t = new TestClass();
		t.method1();
		t.method2();

		// by using parent class object and parent class reference we can call only the
		// parent class functionalities
		Parent ps = new Parent();
		ps.method1();
		// By using parent class reference and child class object we will get only
		// the parent class functionalities we cannot get the child class
		// functionalities
		// THIS IS CALLED UPCASTING
		Parent p = new TestClass();
		p.method1();
		// DOWN CASTING IS NOT POSSIBLE IN JAVA
		TestClass t1 = (TestClass) new Parent();
		t1.method1();
		t1.method2();

	}

}
