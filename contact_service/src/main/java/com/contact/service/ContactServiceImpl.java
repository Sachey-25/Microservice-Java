package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.enity.Contact;

@Service
public class ContactServiceImpl implements ContactService{
	
	//Contact information
	
	List<Contact> list=List.of(
			new Contact (1L, "Sachin.pratik97@hotmail.com", "Sachin Anil",1211L ),
			new Contact (2L, "Sourav.Ganguly@hotmail.com", "Sourav Ganguly",1212L ),
			new Contact (3L, "Rahul.Dravid@hotmail.com", "Rahul Dravid",1213L ),
			new Contact (4L, "Yuvi.Singh@hotmail.com", "Yuvraj Singh",1214L ),
			new Contact (5L, "Rohit.sharma7@hotmail.com", "Rohit Sharma",1215L )
		);

	public List<Contact> getContactOfUser(Long userId){
		return list.stream()
				.filter( contact -> contact.getUserId().equals(userId))
				.collect(Collectors.toList());
	}
	
	}
