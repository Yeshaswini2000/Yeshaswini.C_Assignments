package com.valtech.spring.boot.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.spring.boot.entity.Book;
import com.valtech.spring.boot.service.CarService;

@RestController
public class CarRestController {
	
	@Autowired
	private CarService carService;
	
	@PutMapping("/api/cars/{id}")
	public Book updateCar(@PathVariable("id") int id){
		return carService.updateCar(car);
		
	}
	
	@PostMapping("/api/cars")
	public Book createCar(@RequestBody Book car){
		return carService.createCar(car);
	}

	
	@GetMapping("api/cars")
	public List<Book>getCars(){
		return carService.getAllCars();
	}
	
	@GetMapping("/api//cars/{id}")
	public Book getCar(@PathVariable("id") int id){
		return carService.getCar(id);
		
	}
}
