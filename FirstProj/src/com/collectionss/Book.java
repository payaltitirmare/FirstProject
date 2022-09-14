package com.collectionss;

import java.util.ArrayList;

public class Book {

	int book_id;
	String book_name;
	double book_price;
	
	public Book(int book_id, String book_name, double book_price) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_price = book_price;
	}

	public static void main(String[] args) {
	
		ArrayList<Book> tech_book=new ArrayList<>();
		
		tech_book.add(new Book(1,"C++ by Kanetkar sir",344.32));
		tech_book.add(new Book(2,"Head First Java",365.23));
		tech_book.add(new Book(3,"Head First Servlet",356.45));
	    
		ArrayList<Book> non_tech_book=new ArrayList<>();
		non_tech_book.add(new Book(1,"Subconcious Mind",344.32));
		non_tech_book.add(new Book(2,"Think like a billionier",365.23));
		non_tech_book.add(new Book(3,"Marketing Strategies",356.45));
		
		ArrayList<Book> all_book=new ArrayList<Book>();
		all_book.addAll(tech_book);
		all_book.addAll(non_tech_book);
		for(Book b: all_book) {
			System.out.println(b.book_id+" "+b.book_name+" "+b.book_price);
		}
		System.out.println(all_book.containsAll(tech_book));

	}

}
