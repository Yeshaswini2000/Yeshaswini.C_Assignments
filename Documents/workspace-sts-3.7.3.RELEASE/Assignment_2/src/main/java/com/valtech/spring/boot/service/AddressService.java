package com.valtech.spring.boot.service;

import java.util.List;


import com.valtech.spring.boot.assignment.entity.Address;

public interface AddressService {

	Address createAddress(Address authora);

	Address updateAddress(Address authora);

	Address getaddress(int id);

	List<Address> getAllAddress();

}