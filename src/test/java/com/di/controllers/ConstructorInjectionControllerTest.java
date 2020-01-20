package com.di.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.di.services.GreetingServiceImpl;

public class ConstructorInjectionControllerTest {
	private ConstructorInjectionController constructorInjectionController;

	@Before
	public void setUp() {
		constructorInjectionController = new ConstructorInjectionController(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO, constructorInjectionController.sayHello());
	}
}
