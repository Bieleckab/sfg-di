package com.bielecka.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bielecka.di.services.ContructorGreetingSevice;

class SetterInjectedControllerTest {

	SetterInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ContructorGreetingSevice());
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
