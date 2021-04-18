package com.util;
import com.book.Book;

import com.book.Bookstore;

public class Bookutil {

	public static void main(String[] args) {
		Bookstore bookstore=new Bookstore();
		bookstore.addBook(new Book("B101", "Java", "Bala", "Technology", 599.0f));
		bookstore.addBook(new Book("B102", "Physics", "Qed", "Science", 745.0f));
		bookstore.addBook(new Book("B103", "Math", "Aryabhatta", "Fiction", 699.0f));
		bookstore.searchByTitle("physics");
		System.out.println();
		bookstore.searchByAuthor("Aryabhatta");
		System.out.println();
		bookstore.display();
		// TODO Auto-generated method stub

	}

}
