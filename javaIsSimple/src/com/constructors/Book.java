package com.constructors;

public class Book {
	int bookId;
	String bookName;
	String authorName;
	double price;
	String publisher;

	Book(int bookId, String bookName) {
		System.out.println("2 Arg Constructor called !");
		this.bookId=bookId;
		this.bookName=bookName;
		
	}

	Book(int bookId, String bookName, String authorName) {
		System.out.println("3 Arg constructor called !");
		this.bookId=bookId;
		this.bookName=bookName;
		this.authorName=authorName;
	}

	Book(int bookId, String bookName, String authorName, double price) {
		System.out.println("4 Arg Constuctor called !");
		this.bookId=bookId;
		this.bookName=bookName;
		this.authorName=authorName;
		this.price=price;
	}

	Book(int bookId, String bookName, String authorName, double price, String publisher) {
		System.out.println("5 Arg Constructor called !");
		this.bookId=bookId;
		this.bookName=bookName;
		this.authorName=authorName;
		this.price=price;
		this.publisher=publisher;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Book b = new Book(1001, "Book1");
		Book b1 = new Book(1002, "Book2", "Author 2");
		Book b2 = new Book(1003, "Book3", "Author 3", 99.9);
		Book b3 = new Book(1004, "Book4", "Author 4", 100.00,"Pulisher");
		
		b.bookInfo();
		b1.bookInfo();
		b2.bookInfo();
		b3.bookInfo();
		

	}

	void bookInfo() {
		System.out.println("**********************");
		System.out.println("Book id :" + bookId);
		System.out.println("Book Name :" + bookName);
		System.out.println("Author Name :" + authorName);
		System.out.println("Price :" + price);
		System.out.println("Publisher :" + publisher);

	}

}
