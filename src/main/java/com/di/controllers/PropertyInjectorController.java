package com.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.di.services.GreetingService;

@Controller
public class PropertyInjectorController {
	
	@Autowired
	public GreetingService greetingServiceImpl; //the name is important as with this name only it searches the bean/class
	
	public String sayHello() {
		return greetingServiceImpl.sayHello();
	}
}
