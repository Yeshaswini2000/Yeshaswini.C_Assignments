package com.valtech.spring.boot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.spring.boot.entity.Book;

@Repository
public interface CarRepository extends JpaRepository<Book, Integer>{
	
	List<Book>findByColor(String color);
	List<Book>findByPriceLessThan(float minPrice);
	List<Book>findByColorAndPriceLessThan(String color,float minPrice);
	

}
