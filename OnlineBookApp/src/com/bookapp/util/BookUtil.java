package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookUtil {

	public static List<Book> showBooks() {

		List<Book> books = Arrays.asList(
				new Book("Java in Action", "Kathy", 650, "Tech", 10),
				new Book("Conversations", "John", 1650, "selfhelp", 11),
				new Book("Html for dummies", "David", 900, "Tech", 12),
				new Book("Leadership", "Robin", 1230, "selfhelp", 13),
				new Book("Java 8 Features", "Helen", 1250, "Tech", 14),
				new Book("5 am club", "Robin", 450, "selfhelp", 15),
				new Book("Java Black Book", "Gray", 850, "Tech", 16), 
				new Book("Monk", "Robin", 850, "selfhelp", 17));
		return books;
	}
}
