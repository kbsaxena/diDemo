package com.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.di.services.GreetingService;

@Controller
public class SetterInjectionController {
	private GreetingService greetService;

	@Autowired
	@Qualifier("setterGreetingService")
	//Another way to define Qualifier  : public void setGreetService(@Qualifier("setterGreetingService") GreetingService greetService) {
	public void setGreetService(GreetingService greetService) {
		this.greetService = greetService;
	}
	
	public String sayHello() {
		return greetService.sayHello();
	}
}
