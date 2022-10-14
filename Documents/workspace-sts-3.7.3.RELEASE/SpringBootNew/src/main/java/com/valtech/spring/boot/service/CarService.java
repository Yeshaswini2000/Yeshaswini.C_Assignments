package com.valtech.spring.boot.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.spring.boot.entity.Book;

public interface CarService {

	Book createCar(Book car);

	Book updateCar(Book car);

	Book getCar(int id);

	List<Book> getAllCars();

}