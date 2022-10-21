package com.valtech.account.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.account.entity.Customer;

import com.valtech.account.service.CustomerService;

@RestController
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;

	@PutMapping("/api/customers/{id}")
	public Customer updateCustomer(@PathVariable("id") long id, @RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}

	@PostMapping("/api/customers")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}

	@GetMapping("api/customers")
	public List<Customer> getCustomers() {
		return customerService.getAllCustomers();
	}

	@GetMapping("/api/customers/{id}")
	public Customer getCustomer(@PathVariable("id") long id) {
		return customerService.getCustomer(id);
	}
}
