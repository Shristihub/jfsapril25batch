package com.bookapp.client;

import java.util.Iterator;
import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Customer {
	public static void main(String[] args) {
		//interface ref = impl class
		
		IBookService bookService = new BookServiceImpl();
		List<Book> books=bookService.getAllBooks();
		System.out.println("Getting all books");
		for(Book book:books) {
			System.out.println(book);
		}
		System.out.println();
//		books.forEach(book->System.out.println(book));
		books.forEach(System.out::println);
		
		System.out.println();
		System.out.println("Getting By Author");
		try {
			List<Book> booksByAuth = bookService.getByAuthor("Kathy");
			booksByAuth.forEach(System.out::println);
			} catch (BookNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Getting all categories");
		bookService.getAllCategory()
		        .forEach(cat->System.out.println(cat.toUpperCase()));
		
		System.out.println();
		System.out.println("Getting by id");
		try {
			Book book = bookService.getById(12);
			System.out.println(book);
		} catch (BookNotFoundException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println("Getting by price");
		try {
			List<Book> booksByPrice = bookService.getByPriceTitleWith("Java",1000);
			booksByPrice.forEach(System.out::println);
		} catch (BookNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}

}
