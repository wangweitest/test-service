package com.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Override
	public String testService(){
		return "testService";
	}

}
