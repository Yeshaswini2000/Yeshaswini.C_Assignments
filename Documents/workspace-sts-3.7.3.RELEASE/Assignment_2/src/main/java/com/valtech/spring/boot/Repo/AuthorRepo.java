package com.valtech.spring.boot.Repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.spring.boot.assignment.entity.Author;



@Repository
public interface AuthorRepo extends JpaRepository<Author, Integer>{
	
	List<Author>findByName(String name);
	List<Author>findByphonenum(long phonenum);
	List<Author>findByNameAndPhonenum(String name,long phonenum);
	

}
