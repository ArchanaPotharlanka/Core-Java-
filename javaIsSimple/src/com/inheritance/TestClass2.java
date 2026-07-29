package com.inheritance;

//violating the rule 3 
class Parent1 {

	public void display() {
		System.out.println("Parent");
	}
}

class Child extends Parent {

//	@Override
//	protected void display() { // ❌ Compile-time Error
//		System.out.println("Child");
//	}
}
