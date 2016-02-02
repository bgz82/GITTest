package com.bhargav.spring.sample.services;

import java.util.List;

import com.bhargav.spring.sample.entities.Address;

public interface AddressService {
	public boolean save(Address address);
	public boolean delete(Address address);
	public List<Address> getList();
	public boolean update(Address address);
	public List<Address> getUserAddressList(long id);
}
