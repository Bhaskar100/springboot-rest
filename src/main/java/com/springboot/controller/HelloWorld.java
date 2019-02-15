package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("/hello")

	public String getHelloWolrd() {
		
		return "Hello Springboot ";

	
	}

}
