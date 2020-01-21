package com.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary //Marking this as primary always calls this bean when there is a conflict between beans at runtime
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayHello() {
		return "Its Primary Greeting Service";
	}

}
