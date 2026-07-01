package com.accessModifiers;
//private interface in1{

//	
//}

//private class TestDemo {
public class TestDemo {
	private int p = 20;
	protected int a = 2;
	protected String name = "sri";

	protected TestDemo() {
		System.out.println("Protected constructor called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		TestDemo t = new TestDemo();
//		hello();
	}

//	static  void hello() {
//		System.out.println("Hello method called ");
//	}
//	private {
//		System.out.println("Instance block called ");
//	}

}

class demo {
//	public static void main(String[] args) {
		TestDemo t = new TestDemo();
//		t.p;
//		t.hello();

//	}
}