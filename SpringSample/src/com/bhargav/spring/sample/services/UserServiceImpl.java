package com.bhargav.spring.sample.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.bhargav.spring.sample.dao.UserDao;
import com.bhargav.spring.sample.entities.Address;
import com.bhargav.spring.sample.entities.User;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao;
	
	public void setUserDao(UserDao uDao)
	{
		this.userDao = uDao;
	}
	
	@Override
	@Transactional
	public boolean save(User user) {
		// TODO Auto-generated method stub
		return this.userDao.save(user);
	}

	@Override
	@Transactional
	public boolean delete(User user) {
		// TODO Auto-generated method stub
		return this.userDao.delete(user);
	}

	@Override
	@Transactional
	public List<User> getList() {
		// TODO Auto-generated method stub
		return this.userDao.getList();
	}

	@Override
	@Transactional
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return this.userDao.update(user);
	}

	@Override
	@Transactional
	public List<Address> getAddressList(long id) {
		// TODO Auto-generated method stub
		return this.userDao.getAddressList(id);
	}

}
