package com.ecommerce.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	private String userName;
	private String userLastName;
	private String email;
	private long phoneNumber;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String userName, String userLastName, String email, long phoneNumber) {
		this.id = id;
		this.userName = userName;
		this.userLastName = userLastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public String getEmail() {
		return email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
