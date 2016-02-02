package com.bhargav.spring.sample.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="addresstest")
public class Address {

	@Id
	@GeneratedValue
	@Column(name="id", unique=true, nullable=false)
	private long id;
	
	@Column(name="street1", unique=false, nullable=false)
	private String street1;
	
	@Column(name="street2", unique=false,nullable=true)
	private String street2;
	
	@Column(name="zipcode", unique=false, nullable=false)
	private long zipcode;
	
	 @ManyToOne
     @JoinColumn(name="userid", referencedColumnName="id")
	 private User user;

	 public Address(){
		 
	 }
	 
	public Address(int id, String street1, String street2, long zipcode, User user) {
		super();
		this.id = id;
		this.street1 = street1;
		this.street2 = street2;
		this.zipcode = zipcode;
		this.user = user;
	}

	public String getStreet1() {
		return street1;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Address [street1=" + street1 + ", street2=" + street2
				+ ", zipcode=" + zipcode + ", user=" + user + "]";
	}
	 
	 
}
