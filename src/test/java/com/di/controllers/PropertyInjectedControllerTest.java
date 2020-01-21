package com.di.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.di.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {
	
	private PropertyInjectorController propertyInjectorController;
	
	@Before
	public void setUp() {
		propertyInjectorController = new PropertyInjectorController();
		propertyInjectorController.greetingServiceImpl = new GreetingServiceImpl();
	}
	
	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO, propertyInjectorController.sayHello());
	}

}
