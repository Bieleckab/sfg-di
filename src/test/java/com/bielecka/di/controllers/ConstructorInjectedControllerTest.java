package com.bielecka.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bielecka.di.services.GreetingSeviceImpl;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new GreetingSeviceImpl());
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
