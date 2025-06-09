package com.bookapp.client;

import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Customer {
	public static void main(String[] args) {
		//interface ref = impl class
		
		IBookService bookService = new BookServiceImpl();
		
	}

}
