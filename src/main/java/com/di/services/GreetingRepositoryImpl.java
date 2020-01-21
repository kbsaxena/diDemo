package com.di.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository{

	@Override
	public String getEnglishGreeting() {
		return "Its Primary Greeting Service";
	}

	@Override
	public String getSpanishGreeting() {
		return "Su servicio principal de saludo";
	}

	@Override
	public String getGermanGreeting() {
		return "Der primäre Begrüßungsdienst";
	}

}
