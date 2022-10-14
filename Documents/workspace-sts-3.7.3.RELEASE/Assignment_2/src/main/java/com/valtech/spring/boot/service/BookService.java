package com.valtech.spring.boot.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.spring.boot.assignment.entity.Book;

public interface BookService {

	Book createBook(Book book);

	Book updateBook(Book book);

	Book getBook(int id);

	List<Book> getAllBooks();

}