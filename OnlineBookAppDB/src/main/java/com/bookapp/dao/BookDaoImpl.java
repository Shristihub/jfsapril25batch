package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.DatabaseUtil;
import com.bookapp.util.Queries;

public class BookDaoImpl implements IBookDao{
	
	static Connection connection;
	static {
//	    get the  connection
		connection = DatabaseUtil.openConnection();
	 }
	
	@Override
	public void addBook(Book book) {
//		create prepared statement
		try(PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY)){
//		set values for placeholders
			statement.setString(1, book.getTitle());
			statement.setString(2,book.getAuthor());
			statement.setDouble(3, book.getPrice());
			statement.setString(4, book.getCategory());
//			execute
			statement.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateBook(int bookId, double price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book findById(int bookId) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByAuthor(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByPriceTitleWith(String title, double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findAllCategory() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
