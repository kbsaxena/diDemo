package com.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary //if we have 2 classes as Primary then it matches by profile
@Profile("german")
public class PrimaryGermanGreetingService implements GreetingService {

	@Override
	public String sayHello() {
		return "Der primäre Begrüßungsdienst";
	}

}
