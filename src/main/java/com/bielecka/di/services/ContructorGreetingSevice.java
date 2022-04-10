package com.bielecka.di.services;

import org.springframework.stereotype.Service;

@Service
public class ContructorGreetingSevice implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World - Constructor";
	}

}
