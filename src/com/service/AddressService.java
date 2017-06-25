package com.service;

import javax.jws.WebService;

import com.service.model.Address;

@WebService
public interface AddressService {
	
	public Address getAddress(int id);

}
