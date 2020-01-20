package com.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.di.services.GreetingService;

@Controller
public class ConstructorInjectionController {
	private GreetingService greetService;
    
	//@Autowired annotation is not mandatory...so its optional
	//From release 4.2 autowiring is auto enabled for constructor based DI
	public ConstructorInjectionController(GreetingService greetService) {
		super();
		this.greetService = greetService;
	}
	
	public String sayHello() {
		return greetService.sayHello();
	}
}
