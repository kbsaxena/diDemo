package com.di.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{

	@Override
	public String sayHello() {
		return "Hello, I am Constructor based Injection";
	}
}
