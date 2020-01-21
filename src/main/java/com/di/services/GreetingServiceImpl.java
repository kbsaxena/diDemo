package com.di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

	public static final String HELLO = "Hello Everyone - This is greeting Service impl";
	
	@Override
	public String sayHello() {
		return HELLO;
	}

}
