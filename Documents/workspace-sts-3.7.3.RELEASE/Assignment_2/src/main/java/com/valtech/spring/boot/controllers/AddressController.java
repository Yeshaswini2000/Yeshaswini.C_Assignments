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


import com.valtech.spring.boot.assignment.entity.Address;

import com.valtech.spring.boot.service.AddressService;



@Controller
public class AddressController {
	@Autowired
	private AddressService addressService;

	@PostMapping("/addresss/updateAddress/{id}")
	public ModelAndView saveUpdateAddress(@PathVariable("id") int id, @ModelAttribute Address address,
			@RequestParam("submit") String submit) {
		ModelAndView view = new ModelAndView("/addresss/list");
		if (submit.equals("Cancel")) {
			view.addObject("address",addressService.getAllAddress());
			return view;
		}
		addressService.updateAddress(address);
		view.addObject("address", addressService.getAllAddress());
		return view;

	}

	@GetMapping("/addresss/updateAddress/{id}")
	public String updateaddress(@PathVariable("id") int id, Model model) {
		model.addAttribute("address", addressService.getaddress(id));
		return "addresss/updateAddress";

	}

	@PostMapping("/addresss/newAddress")
	public ModelAndView saveNewAddress(@ModelAttribute Address address) {
		ModelAndView mnv = new ModelAndView("addresss/list");
		addressService.createAddress(address);
		mnv.getModel().put("addresss", addressService.getAllAddress());
		return mnv;

	}

	@GetMapping("/addresss/newAddress")
	public String newAddress() {
		return "addresss/newAddress";
	}

	@GetMapping("/addresss/list")
	public String list(Model model) {
		System.out.println("List of Address");
		model.addAttribute("addresss", addressService.getAllAddress());
		return "addresss/list"; // prefix/cars/list/suffix=/WEB-INF/views/cars/list.jsp

	}


}
