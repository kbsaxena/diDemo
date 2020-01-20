package com.di.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.di.services.GreetingServiceImpl;

public class SetterInjectionControllerTest {
	private SetterInjectionController setterInjectionController;

	@Before
	public void setUp() {
		setterInjectionController = new SetterInjectionController();
		setterInjectionController.setGreetService(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO, setterInjectionController.sayHello());
	}
}
