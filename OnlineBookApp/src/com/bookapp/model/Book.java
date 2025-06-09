package com.bookapp.model;

public class Book {

	private String title;
	private String author;
	private double price;
	private String category;
	private Integer bookId;
	// create default, parameterized constr, getter setter  to String
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String author, double price, String category, Integer bookId) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", category=" + category
				+ ", bookId=" + bookId + "]";
	}
	
	
	
}
