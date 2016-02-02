package com.bhargav.spring.sample.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.bhargav.spring.sample.entities.Address;

public class AddressDaoImpl implements AddressDao{

	private SessionFactory sessionFactory;
	private Session session;
	
	public AddressDaoImpl()
	{
		sessionFactory = null;
		session = null;
	}
	
	@Autowired
	public void setSessionFactory(SessionFactory sFactory)
	{
		this.sessionFactory = sFactory;
	}
	
	@Override
	public boolean save(Address address) {
		// TODO Auto-generated method stub
		try{
			session = sessionFactory.getCurrentSession();
			session.save(address);
			return true;
			}
			catch(HibernateException he)
			{
				return false;
			}
	}

	@Override
	public boolean delete(Address address) {
		// TODO Auto-generated method stub

		try{
			session = sessionFactory.getCurrentSession();
			session.delete(address);
			return true;
			}
			catch(HibernateException he)
			{
				return false;
			}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Address> getList() {
		// TODO Auto-generated method stub
		session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM Address").list();
	}

	@Override
	public boolean update(Address address) {
		// TODO Auto-generated method stub
		try{
			session = sessionFactory.getCurrentSession();
			session.update(address);
			return true;
			}
			catch(HibernateException he)
			{
				return false;
			}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Address> getUserAddressList(long id) {
		// TODO Auto-generated method stub
		session = sessionFactory.getCurrentSession();
		Query retrieve = session.createQuery("FROM addresstest where userid=:id");
		retrieve.setParameter("userid", id);
		return (List<Address>)retrieve.list();
	}

	
}
