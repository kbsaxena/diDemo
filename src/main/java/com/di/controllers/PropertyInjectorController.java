package com.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.di.services.GreetingService;

@Controller
public class PropertyInjectorController {
	
	@Autowired
	public GreetingService greetService;
	
	public String sayHello() {
		return greetService.sayHello();
	}
}
