package com.bielecka.di.controllers;

import org.springframework.stereotype.Controller;

import com.bielecka.di.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
