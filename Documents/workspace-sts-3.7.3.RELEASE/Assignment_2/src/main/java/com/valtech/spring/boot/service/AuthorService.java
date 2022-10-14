package com.valtech.spring.boot.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.spring.boot.assignment.entity.Author;

public interface AuthorService {

	Author createAuthor(Author author);

	Author updateAuthor(Author author);

	Author getauthor(int id);

	List<Author> getAllAuthor();

}