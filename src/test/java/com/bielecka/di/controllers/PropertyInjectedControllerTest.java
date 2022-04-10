package com.bielecka.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bielecka.di.services.ContructorGreetingSevice;

class PropertyInjectedControllerTest {

	public PropertyInjectedController controller;

	@BeforeEach
	public void setUp() {
		controller = new PropertyInjectedController();

		controller.greetingService = new ContructorGreetingSevice();
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
