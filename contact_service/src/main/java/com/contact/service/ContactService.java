package com.contact.service;

import java.util.List;

import com.contact.enity.Contact;

public interface ContactService {
	
	public List<Contact> getContactOfUser(Long userId);

}
