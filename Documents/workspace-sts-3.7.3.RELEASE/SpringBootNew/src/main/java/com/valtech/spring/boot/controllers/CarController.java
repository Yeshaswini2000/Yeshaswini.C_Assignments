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
import org.springframework.web.servlet.View;

import com.valtech.spring.boot.entity.Book;
import com.valtech.spring.boot.service.CarService;

@Controller()
public class CarController {

	@Autowired
	private CarService carService;

	@PostMapping("/cars/updateCar/{id}")
	public ModelAndView saveUpdateCar(@PathVariable("id") int id, @ModelAttribute Book car,
			@RequestParam("submit") String submit) {
		ModelAndView view = new ModelAndView("/cars/list");
		if (submit.equals("Cancel")) {
			view.addObject("cars", carService.getAllCars());
			return view;
		}
		carService.updateCar(car);
		view.addObject("cars", carService.getAllCars());
		return view;

	}

	@GetMapping("/cars/updateCar/{id}")
	public String updateCar(@PathVariable("id") int id, Model model) {
		model.addAttribute("car", carService.getCar(id));
		return "cars/updateCar";

	}

	@PostMapping("/cars/newCar")
	public ModelAndView saveNewCar(@ModelAttribute Book car) {
		ModelAndView mnv = new ModelAndView("cars/list");
		carService.createCar(car);
		mnv.getModel().put("cars", carService.getAllCars());
		return mnv;

	}

	@GetMapping("/cars/newCar")
	public String newCar() {
		return "cars/newCar";
	}

	@GetMapping("/cars/list")
	public String list(Model model) {
		System.out.println("List of cars");
		model.addAttribute("cars", carService.getAllCars());
		return "cars/list"; // prefix/cars/list/suffix=/WEB-INF/views/cars/list.jsp

	}

}
