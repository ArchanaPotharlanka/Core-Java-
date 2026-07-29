package com.inheritance;

class Student implements Cloneable {
	int age;
	String sname;
	Address add;

	public Student(int age, String sname, Address add) {
		this.age = age;
		this.sname = sname;
		this.add = add;

	}

	public Student(Student student) {
		this.age = student.age;
		this.sname = student.sname;
		this.add = new Address(student.add);

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

class Address {
	String city;

	public Address(String city) {
		this.city = city;
	}

	public Address(Address add) {
		this.city = add.city;
	}

}

public class DeepCopy {
	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("Hyderabad");
		Student s1 = new Student(25, "Archana", address);
		Student s2 = new Student(s1);
		System.out.println(s1.sname);
		s2.sname = "Kouser";
		System.out.println(s2.sname);
		s2.add.city = "Banglore";
		System.out.println(s2.add.city);
		System.out.println(s1.add.city);

	}

}
