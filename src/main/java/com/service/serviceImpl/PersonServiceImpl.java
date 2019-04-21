package com.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Override
	public String testService(){
		
		System.out.println("testService 被调用了..");
		return "testService: haha";
	}

}
