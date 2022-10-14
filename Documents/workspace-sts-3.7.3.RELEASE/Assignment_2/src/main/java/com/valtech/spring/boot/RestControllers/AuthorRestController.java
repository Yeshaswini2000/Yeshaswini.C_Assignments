package com.valtech.spring.boot.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.spring.boot.assignment.entity.Author;

import com.valtech.spring.boot.service.AuthorService;

@RestController
public class AuthorRestController {
	@Autowired
	private AuthorService authorService;
	
	@PutMapping("/api/authors/{id}")
	public Author updateAuthor(@PathVariable("id") int id,@RequestBody Author author){
		return authorService.updateAuthor(author);
		
	}
	
	@PostMapping("/api/authors")
	public Author createAuthor(@RequestBody Author author){
		return authorService.createAuthor(author);
	}

	
	@GetMapping("api/authors")
	public List<Author>getAuthors(){
		return authorService.getAllAuthor();
	}
	
	@GetMapping("/api/authors/{id}")
	public Author getAuthor(@PathVariable("id") int id){
		return authorService.getauthor(id);
		
	}

}
