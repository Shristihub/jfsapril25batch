package com.bookapp.service;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookUtil;

public class BookServiceImpl implements IBookService{

	@Override
	public List<Book> getAllBooks() {
		
		return null;
	}

	@Override
	public List<Book> getByAuthor(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByPriceTitleWith(String title, double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
