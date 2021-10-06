package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private Long userId;
	private String username;
	private String phone;
	
	List<Contact> contacts = new ArrayList<>();

	public User(Long userId, String username, String phone, List<Contact> contacts) {
		super();
		this.userId = userId;
		this.username = username;
		this.phone = phone;
		this.contacts = contacts;
	}

	public User(Long userId, String username, String phone) {
		super();
		this.userId = userId;
		this.username = username;
		this.phone = phone;
	}
	
	public User() {
		
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	

}
