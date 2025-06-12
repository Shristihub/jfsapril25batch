package com.bookapp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookUtil;

public class BookServiceImpl implements IBookService{

	@Override
	public List<Book> getAllBooks() {
		List<Book> books = BookUtil.showBooks();
		return books.stream()
				 .sorted((b1,b2)->b1.getTitle().compareTo(b2.getTitle()))
				 .collect(Collectors.toList());
	}

	@Override
	public List<Book> getByAuthor(String author) throws BookNotFoundException {
		List<Book> books = BookUtil.showBooks();
		//convert book to stream and filter by author in parameter
		List<Book> booksByAuthor = books.stream()
							.filter(book->book.getAuthor().equals(author))
							.collect(Collectors.toList());  //convert stream back to list
		// check if newlist has data, add this one to that
		// if list is empty throw exception
		if(booksByAuthor.isEmpty())
			throw new BookNotFoundException("book with this author not available");		
		return booksByAuthor;
	}

	@Override
	public List<String> getAllCategory() {
		List<Book> books = BookUtil.showBooks();
		return books.stream()
		     .map(book->book.getCategory())
		     .distinct()
		     .sorted()
		     .collect(Collectors.toList());
		
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		List<Book> books = BookUtil.showBooks();
//		Optional<Book> opt =  books.stream()
//		      .filter(book->book.getBookId()==bookId)
//		      .findFirst();
//		
//		if(opt.isPresent())
//			return opt.get();
//		else
//			return null;
		
	Book newbook = 	books.stream()
			  .filter(book->book.getBookId()==bookId)
	     	  .findFirst()
			  .orElseThrow(()-> new BookNotFoundException("invalid id"));
		
		return newbook;
	}

	@Override
	public List<Book> getByPriceTitleWith(String choice, double cost) throws BookNotFoundException {
		List<Book> books = BookUtil.showBooks();
		List<Book> booksByPrice = books.stream()
		    .filter(book->book.getTitle().contains(choice))
		    .filter(book->book.getPrice()<cost)
		    .collect(Collectors.toList());
		
		// if list is empty throw exception
		if(booksByPrice.isEmpty())
			throw new BookNotFoundException("book with this price not available");		
		return booksByPrice;    
		
	}
	

}
