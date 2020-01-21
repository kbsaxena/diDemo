package com.di.controllers;

import org.springframework.stereotype.Controller;

import com.di.services.GreetingService;

@Controller
public class DiController {

	private GreetingService greetingService;
	
	public DiController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		System.out.println("Heloooo!!!!!");
		return greetingService.sayHello();
	}

}
