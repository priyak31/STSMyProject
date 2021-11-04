package com.newpack.service;

import java.util.List;

import com.newpack.Book;

public interface BookServiceMain {
	
	
	public List<Book> findAll();
	public Book newBook(Book newBook);
	public Book saveOrUpdate(Book newBook,Long id);
    public void deleteBook(Long id);
	

}
