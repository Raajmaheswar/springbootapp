package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@Value("${TEST_ENV_PROP}")
	String profileDetails;
	
	@Value("${MY_SECRET:aDefaultValue}")
	private String s1;

	@GetMapping("")
	String hello() {
		 
		 
		 return "Hello world is "+profileDetails+" with secret "+s1;
	}
	

}
