package com.bielecka.di.controllers;

import com.bielecka.di.services.GreetingService;

public class ConstructorInjectedController {

	private final GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
