package com.bielecka.di.controllers;

import com.bielecka.di.services.GreetingService;

public class PropertyInjectedController {

	public GreetingService greetingService;

	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
