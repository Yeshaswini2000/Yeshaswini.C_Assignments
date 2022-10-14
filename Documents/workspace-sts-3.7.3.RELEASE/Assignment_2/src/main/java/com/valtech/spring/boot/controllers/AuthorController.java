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

import com.valtech.spring.boot.assignment.entity.Author;

import com.valtech.spring.boot.service.AuthorService;


@Controller
public class AuthorController {
	@Autowired
	private AuthorService authorService;

	@PostMapping("/authors/updateAuthor/{id}")
	public ModelAndView saveUpdateAuthor(@PathVariable("id") int id, @ModelAttribute Author author,
			@RequestParam("submit") String submit) {
		ModelAndView view = new ModelAndView("/authors/list");
		if (submit.equals("Cancel")) {
			view.addObject("author",authorService.getAllAuthor());
			return view;
		}
		authorService.updateAuthor(author);
		view.addObject("author", authorService.getAllAuthor());
		return view;

	}

	@GetMapping("/authors/updateAuthor/{id}")
	public String updateauthor(@PathVariable("id") int id, Model model) {
		model.addAttribute("author", authorService.getauthor(id));
		return "authors/updateAuthor";

	}

	@PostMapping("/authors/newAuthor")
	public ModelAndView saveNewAuthor(@ModelAttribute Author author) {
		ModelAndView mnv = new ModelAndView("authors/list");
		authorService.createAuthor(author);
		mnv.getModel().put("authors", authorService.getAllAuthor());
		return mnv;

	}

	@GetMapping("/authors/newAuthor")
	public String newAuthor() {
		return "authors/newAuthor";
	}

	@GetMapping("/authors/list")
	public String list(Model model) {
		System.out.println("List of Author");
		model.addAttribute("authors", authorService.getAllAuthor());
		return "authors/list"; // prefix/cars/list/suffix=/WEB-INF/views/cars/list.jsp

	}

}
