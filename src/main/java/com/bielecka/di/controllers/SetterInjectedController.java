package com.bielecka.di.controllers;

import com.bielecka.di.services.GreetingService;

public class SetterInjectedController {

	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
