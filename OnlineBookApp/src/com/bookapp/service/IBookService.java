package com.bookapp.service;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public interface IBookService {

	List<Book> getAllBooks();
	List<Book> getByAuthor(String author) throws BookNotFoundException;
	List<String> getAllCategory() ;
	Book  getById(int bookId)throws BookNotFoundException;
	List<Book> getByPriceTitleWith(String title,double price)throws BookNotFoundException;
}
