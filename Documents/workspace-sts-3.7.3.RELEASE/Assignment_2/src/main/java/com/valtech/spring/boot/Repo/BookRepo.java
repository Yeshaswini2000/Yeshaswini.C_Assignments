package com.valtech.spring.boot.Repo;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.spring.boot.assignment.entity.Book;




@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{
	
	List<Book>findByName(String name);
	List<Book>findBywhenPublished(String whenPublished);
	List<Book>findByNameAndWhenPublished(String name,String whenPublished);
	

}
