package com.bookapp.util;

public class Queries {

	public static final String CREATEQUERY = 
			"""
			create table book(title varchar(20),book_Id int primary key auto_increment,
			author varchar(20),price float,category varchar(20));
			""" ;
	public static final String INSERTQUERY = 
			"insert into book(title,author,price,category) values(?,?,?,?)"; 
}
