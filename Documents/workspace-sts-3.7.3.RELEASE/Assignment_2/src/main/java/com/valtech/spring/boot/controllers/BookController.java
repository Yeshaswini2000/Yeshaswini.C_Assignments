package com.valtech.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.valtech.spring.boot.assignment.entity.Book;
import com.valtech.spring.boot.service.BookService;



@Controller
public class BookController {
	@Autowired
	private BookService bookService;

	@PostMapping("/books/updateBook/{id}")
	public ModelAndView saveUpdateBook(@PathVariable("id") int id, @ModelAttribute Book book,
			@RequestParam("submit") String submit) {
		ModelAndView view = new ModelAndView("/books/list");
		if (submit.equals("Cancel")) {
			view.addObject("book",bookService.getAllBooks());
			return view;
		}
		bookService.updateBook(book);
		view.addObject("book", bookService.getAllBooks());
		return view;

	}

	@GetMapping("/books/updateBook/{id}")
	public String updateBook(@PathVariable("id") int id, Model model) {
		model.addAttribute("book", bookService.getBook(id));
		return "books/updateBook";

	}

	@PostMapping("/books/newBook")
	public ModelAndView saveNewBook(@ModelAttribute Book book) {
		ModelAndView mnv = new ModelAndView("books/list");
		bookService.createBook(book);
		mnv.getModel().put("books", bookService.getAllBooks());
		return mnv;

	}

	@GetMapping("/books/newBook")
	public String newBook() {
		return "books/newBook";
	}

	@GetMapping("/books/list")
	public String list(Model model) {
		System.out.println("List of books");
		model.addAttribute("books", bookService.getAllBooks());
		return "books/list"; // prefix/cars/list/suffix=/WEB-INF/views/cars/list.jsp

	}


}
