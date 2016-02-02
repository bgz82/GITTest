package com.bhargav.spring.sample.services;

import java.util.List;

import com.bhargav.spring.sample.dao.AddressDao;
import com.bhargav.spring.sample.entities.Address;

public class AddressServiceImpl implements AddressService {

	private AddressDao addressDao;
	
	public void setAddressDao(AddressDao aDao)
	{
	   this.addressDao = aDao;	
	}
	
	@Override
	public boolean save(Address address) {
		// TODO Auto-generated method stub
		return this.addressDao.save(address);
	}

	@Override
	public boolean delete(Address address) {
		// TODO Auto-generated method stub
		return this.addressDao.delete(address);
	}

	@Override
	public List<Address> getList() {
		// TODO Auto-generated method stub
		return this.addressDao.getList();
	}

	@Override
	public boolean update(Address address) {
		// TODO Auto-generated method stub
		return this.addressDao.update(address);
	}

	@Override
	public List<Address> getUserAddressList(long id) {
		// TODO Auto-generated method stub
		return this.addressDao.getUserAddressList(id);
	}

}
