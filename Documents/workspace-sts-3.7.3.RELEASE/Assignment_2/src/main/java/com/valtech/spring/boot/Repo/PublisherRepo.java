package com.valtech.spring.boot.Repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.valtech.spring.boot.assignment.entity.Publisher;

@Repository
public interface PublisherRepo  extends JpaRepository<Publisher, Integer> {
	

	List<Publisher>findByName(String name);
	List<Publisher>findByAddress(String address);
	List<Publisher>findByNameAndAddress(String name,String address);
}
