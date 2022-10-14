package com.valtech.spring.boot.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.spring.boot.assignment.entity.Address;

import com.valtech.spring.boot.service.AddressService;


@RestController
public class AddressRestController {
	@Autowired
	private AddressService addressService;
	
	@PutMapping("/api/addresss/{id}")
	public Address updateAddress(@PathVariable("id") int id,@RequestBody Address address){
		return addressService.updateAddress(address);
		
	}
	
	@PostMapping("/api/addresss")
	public Address createAddress(@RequestBody Address address){
		return addressService.createAddress(address);
	}

	
	@GetMapping("api/addresss")
	public List<Address>getAddresss(){
		return addressService.getAllAddress();
	}
	
	@GetMapping("/api/addresss/{id}")
	public Address getAddress(@PathVariable("id") int id){
		return addressService.getaddress(id);
		
	}

}
