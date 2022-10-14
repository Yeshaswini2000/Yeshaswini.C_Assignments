package com.valtech.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.spring.boot.entity.Book;
import com.valtech.spring.boot.repo.CarRepository;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepository carRepository;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public Book createCar(Book car) {
		return carRepository.save(car);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public Book updateCar(Book car) {
		return carRepository.save(car);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public Book getCar(int id) {
		return carRepository.getReferenceById(id);
	}

	@Override
	public List<Book> getAllCars() {
		return carRepository.findAll();
	}

}
