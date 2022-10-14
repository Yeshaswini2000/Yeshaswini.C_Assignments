package com.valtech.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.spring.boot.Repo.AddressRepo;

import com.valtech.spring.boot.assignment.entity.Address;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressRepo addressRepository;



	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public Address createAddress(Address address) {
		return addressRepository.save(address);
	}



	@Override

	@Transactional(propagation = Propagation.REQUIRED)
	public Address updateAddress(Address address) {
		return addressRepository.save(address);
	}



	@Override

	@Transactional(propagation = Propagation.REQUIRED)
	public Address getaddress(int id) {
		return addressRepository.getReferenceById(id);
	}



	@Override
	public List<Address> getAllAddress() {
		return addressRepository.findAll();
	}


}
