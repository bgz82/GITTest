package com.bhargav.spring.sample.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.CascadeType;

@Entity
@Table(name="usertest")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name="id", unique=true, nullable=false)
	private long id;
	
	@Column(name="username", unique=true, nullable=false)
	private String username;
	
	@Column(name="password", unique=false, nullable=false)
	private String password;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="id",fetch=javax.persistence.FetchType.LAZY)
	private Set<Address> addressList;
	
	public User(){
		
	}
	
	public User(long id, String username, String password,
			Set<Address> addressList) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.addressList = addressList;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(Set<Address> addressList) {
		this.addressList = addressList;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", addressList=" + addressList + "]";
	}
	

}
