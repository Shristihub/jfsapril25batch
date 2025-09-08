package com.bookapp.main;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Client {

	public static void main(String[] args) {
		//create a Book object
		Book book = new Book("Spring in Action","Johnson",1200,"Tech",null);
		//create a bookservice object
		IBookService bookService =  new BookServiceImpl();
		//call add book method
		bookService.addBook(book);
		
	}
}
