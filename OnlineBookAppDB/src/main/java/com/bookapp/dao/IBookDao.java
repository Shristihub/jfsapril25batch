package com.bookapp.dao;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public interface IBookDao {

	//crud
		void addBook(Book book);
		void updateBook(int bookId, double price);
		void deleteBook(int bookId);
		
		List<Book> findAll();
		Book  findById(int bookId)throws BookNotFoundException;
		List<Book> findByAuthor(String author) throws BookNotFoundException;
		List<Book> findByPriceTitleWith(String title,double price)throws BookNotFoundException;
		List<Book> findByCategory(String category);
		List<String> findAllCategory() ;
}
