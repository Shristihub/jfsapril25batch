package com.bookapp.dao;

public interface IBookDao {

	List<Book> getByCategory(String category);
}
