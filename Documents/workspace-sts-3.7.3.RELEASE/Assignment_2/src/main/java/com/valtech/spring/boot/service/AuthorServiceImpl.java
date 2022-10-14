package com.valtech.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.spring.boot.Repo.AuthorRepo;
import com.valtech.spring.boot.assignment.entity.Author;


@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class AuthorServiceImpl implements AuthorService {
	@Autowired
	private AuthorRepo authorRepository;


	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public Author createAuthor(Author author) {
		return authorRepository.save(author);
	}


	@Override

	@Transactional(propagation = Propagation.REQUIRED)
	public Author updateAuthor(Author author) {
		return authorRepository.save(author);
	}


	@Override

	@Transactional(propagation = Propagation.REQUIRED)
	public Author getauthor(int id) {
		return authorRepository.getReferenceById(id);
	}


	@Override

	public List<Author> getAllAuthor() {
		return authorRepository.findAll();
	}

}
