package com.valtech.spring.boot.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.spring.boot.assignment.entity.Book;
import com.valtech.spring.boot.service.BookService;

@RestController

public class BookRestController {
	
		
		@Autowired
		private BookService bookService;
		
		@PutMapping("/api/books/{id}")
		public Book updateBook(@PathVariable("id") int id,@RequestBody Book book){
			return bookService.updateBook(book);
			
		}
		
		@PostMapping("/api/books")
		public Book createBook(@RequestBody Book book){
			return bookService.createBook(book);
		}

		
		@GetMapping("api/books")
		public List<Book>getBooks(){
			return bookService.getAllBooks();
		}
		
		@GetMapping("/api/books/{id}")
		public Book getBook(@PathVariable("id") int id){
			return bookService.getBook(id);
			
		}
	}



