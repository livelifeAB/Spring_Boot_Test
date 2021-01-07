package com.learning.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.service.WelcomeService;

@RestController
public class WelcomeController {

	@Autowired
	WelcomeService service;
	
	@RequestMapping("/welcome")
	public String welcome() {

		return service.retrieveSomeData();
	}

}

