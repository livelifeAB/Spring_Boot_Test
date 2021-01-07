package com.learning.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService{
	
	public String retrieveSomeData() {
		
		return "Hey Aritra!!You hit Welcome service again";
	}
}