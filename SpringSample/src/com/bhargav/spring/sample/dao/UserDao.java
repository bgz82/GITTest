package com.bhargav.spring.sample.dao;

import java.util.List;

import com.bhargav.spring.sample.entities.Address;
import com.bhargav.spring.sample.entities.User;

public interface UserDao {

	public boolean save(User user);
	public boolean delete(User user);
	public List<User> getList();
	public boolean update(User user);
	public List<Address> getAddressList(long id);
}
