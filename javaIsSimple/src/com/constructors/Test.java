package com.constructors;

public class Test {

	static {
		System.out.println("Static block executed ");
	}
	{
		System.out.println("Instance block executed");
	}

	Test() {
		System.out.println("Constructor executed ");
	}

//	static Test t = new Test();
//	Test t = new Test();

	public static void main(String[] args) {
		System.out.println("Main method started");
		Test t1 = new Test();
	}

}
