package com.inheritance;

import java.util.Objects;

class Employee {

	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		Employee e = (Employee) obj;

		return this.id == e.id && this.name.equals(e.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
}

public class EqualsMethod {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Archana");
		Employee e2 = new Employee(101, "Archana");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

		System.out.println(e1.equals(e2));
	}
}