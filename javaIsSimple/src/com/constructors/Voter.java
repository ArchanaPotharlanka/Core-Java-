package com.constructors;

public class Voter {
	int voterId;
	String voterName;
	int age;
	boolean hasVoted;

	Voter(int voterId, String voterName, int age, boolean hasVoted) {
		this.voterId = voterId;
		this.voterName = voterName;
		this.age = age;
		this.hasVoted = hasVoted;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Voter v = new Voter(101, "Archana", 18, false);
		v.checkEligibility();

		v.checkEligibility();

		Voter v1 = new Voter(102, "Harika", 16, false);
		v1.checkEligibility();

		v1.checkEligibility();

	}

	void checkEligibility() {

		if (age >= 18) {
			if (hasVoted == false) {
				vote();
			} else {
				System.out.println("You already voted ");
			}
		} else {
			System.out.println(voterName+" You are not eligible to vote ");
		}

	}

	void vote() {
		System.out.println(voterName +" Voted Successfully");
		hasVoted = true;

	}

}
