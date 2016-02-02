package com.bhargav.spring.sample.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.bhargav.spring.sample.entities.Address;
import com.bhargav.spring.sample.entities.User;

public class UserDaoImpl implements UserDao{

	private SessionFactory sessionFactory;
	private Session session;
	private AddressDaoImpl addressImpl;
	
	public UserDaoImpl()
	{
		sessionFactory = null;
		session=null;
		addressImpl = null;
	}
	
	@Autowired
	public void setAddressImpl(AddressDaoImpl adImpl)
	{
	  this.addressImpl = adImpl;	
	}
	
	@Autowired
	public void setSessionFactory(SessionFactory sFactory)
	{
	   this.sessionFactory = sFactory;	
	}
	
	@Override
	public boolean save(User user) {
		// TODO Auto-generated method stub
		try{
		session = sessionFactory.getCurrentSession();
		session.save(user);
		return true;
		}
		catch(HibernateException he)
		{
			return false;
		}
	}

	@Override
	public boolean delete(User user) {
		// TODO Auto-generated method stub
		
		try{
			session = sessionFactory.getCurrentSession();
			session.delete(user);
			return true;
			}
			catch(HibernateException he)
			{
				return false;
			}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getList() {
		// TODO Auto-generated method stub
			session = sessionFactory.getCurrentSession();
			return (List<User>)session.createQuery("FROM User").list();
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		try{
			session = sessionFactory.getCurrentSession();
			session.update(user);
			return true;
			}
			catch(HibernateException he)
			{
				return false;
			}
	}

	@Override
	public List<Address> getAddressList(long id) {
		// TODO Auto-generated method stub
		return this.addressImpl.getUserAddressList(id);
	}
	
}
