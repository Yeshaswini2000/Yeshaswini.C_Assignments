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


import com.valtech.spring.boot.assignment.entity.Publisher;

import com.valtech.spring.boot.service.PublisherService;


@Controller
public class PublisherController {
	@Autowired
	private PublisherService publisherService;

	@PostMapping("/publishers/updatePublisher/{id}")
	public ModelAndView saveUpdatePublisher(@PathVariable("id") int id, @ModelAttribute Publisher publisher,
			@RequestParam("submit") String submit) {
		ModelAndView view = new ModelAndView("/publishers/list");
		if (submit.equals("Cancel")) {
			view.addObject("publisher",publisherService.getAllPublishers());
			return view;
		}
		publisherService.updatePublisher(publisher);
		view.addObject("publisher", publisherService.getAllPublishers());
		return view;

	}

	@GetMapping("/publishers/updatePublisher/{id}")
	public String updatepublisher(@PathVariable("id") int id, Model model) {
		model.addAttribute("publisher", publisherService.getPublisher(id));
		return "publishers/updatePublisher";

	}

	@PostMapping("/publishers/newPublisher")
	public ModelAndView saveNewPublisher(@ModelAttribute Publisher publisher) {
		ModelAndView mnv = new ModelAndView("publishers/list");
		publisherService.createPublisher(publisher);
		mnv.getModel().put("publishers", publisherService.getAllPublishers());
		return mnv;

	}

	@GetMapping("/publishers/newPublisher")
	public String newPublisher() {
		return "publishers/newPublisher";
	}

	@GetMapping("/publishers/list")
	public String list(Model model) {
		System.out.println("List of Publisher");
		model.addAttribute("publishers", publisherService.getAllPublishers());
		return "publishers/list"; // prefix/cars/list/suffix=/WEB-INF/views/cars/list.jsp

	}

}
