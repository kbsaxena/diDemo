package com.di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{

	@Override
	public String sayHello() {
		return "Hello, I am Setter Based Injection";
	}

}
