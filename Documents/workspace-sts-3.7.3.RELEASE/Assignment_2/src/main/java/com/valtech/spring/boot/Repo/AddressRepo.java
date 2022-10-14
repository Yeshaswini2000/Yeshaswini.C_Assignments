package com.valtech.spring.boot.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.valtech.spring.boot.assignment.entity.Address;
@Repository
public interface AddressRepo extends JpaRepository<Address, Integer>{

	List<Address>findByStreet(String street);
	List<Address>findByCity(String city);
	List<Address>findByStreetAndCity(String street,String city);
	List<Address>findByState(String state);
	List<Address>findByZipCode(int id);
	List<Address>findByStateAndZipCode(String state,int id);

}
