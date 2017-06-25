package com.service.impl;

import javax.jws.WebService;

import com.service.AddressService;
import com.service.model.Address;

@WebService(endpointInterface="com.service.AddressService")
public class AddressServiceImpl implements AddressService{

	@Override
	public Address getAddress(int id) {
		// TODO Auto-generated method stub
		Address address=new Address();
		
		address.setAddressLine1("keshav nagar pchinchwadgaon");
		address.setAddressLine2("Pune");
		address.setCity("Pune");
		address.setPincode("411033");
		return address;
	}

}
