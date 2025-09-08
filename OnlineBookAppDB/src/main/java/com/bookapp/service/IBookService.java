package com.bookapp.service;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public interface IBookService {
	
	
	//crud
	void addBook(Book book);
	void updateBook(int bookId, double price);
	void deleteBook(int bookId);
	
	List<Book> getAllBooks();
	Book  getById(int bookId)throws BookNotFoundException;
	List<Book> getByAuthor(String author) throws BookNotFoundException;
	List<Book> getByPriceTitleWith(String title,double price)throws BookNotFoundException;
	List<Book> getByCategory(String category);
	List<String> getAllCategory() ;
	
	
}
