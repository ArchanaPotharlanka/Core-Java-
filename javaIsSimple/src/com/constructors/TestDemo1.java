package com.constructors;

public class TestDemo1 {
	int movieId;
	String movieName;
	String heroName;
	float rating;

	TestDemo1() {
		this(101);
	}

	TestDemo1(int movieId) {
		this(movieId, "Eega");
	}

	TestDemo1(int movieId, String movieName) {
		this(movieId, movieName, "Nani");
	}

	TestDemo1(int movieId, String movieName, String heroName) {
		this(movieId, movieName, heroName, 4.5f);
	}

	TestDemo1(int movieId, String movieName, String heroName, float rating) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.heroName = heroName;
		this.rating = rating;

	}

	public TestDemo1(TestDemo1 t) {
		this(102, "Paradise", t.heroName, 5.5f);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		TestDemo1 t = new TestDemo1();
		t.display();
		TestDemo1 t1 = new TestDemo1(t);
		t1.display();
	}

	void display() {
		System.out.println("************************");
		System.out.println("Movie Name :" + movieName);
		System.out.println("Movie Id :" + movieId);
		System.out.println("Hero name : " + heroName);
		System.out.println("rating : " + rating);

	}

}
