package com.book;

public class Book {
	private String bookID;
	private String bookTitle;
	private String author;
	private String category;
	private float price;

	public Book(String bookID, String bookTitle, String author, String category, float price) {
		String s = "" + bookID.charAt(0);
		if (s.equals("B") && bookID.length() == 4)
		this.bookID = bookID;
		this.bookTitle = bookTitle;
		this.author = author;
		if (category.equalsIgnoreCase("Science") || category.equalsIgnoreCase("Fiction") || category.equalsIgnoreCase("Technology")|| category.equalsIgnoreCase("Others"))
		{
			this.category = category;
		}
		if(price>=0) {
			this.price=price;
		}
	}

	public String toString() {
		return "bookID :" +bookID + "\n bookTitle:"+bookTitle + "\n author:"+author + "\ncategory:"+category + "\nprice:"+price;
	}

}
