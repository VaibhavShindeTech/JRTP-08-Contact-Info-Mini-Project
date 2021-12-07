package com.vaibhavshindetech.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactInfoRestController {
	@GetMapping(value = "/welcome")
	public String greetMsg() {
		return "Welcome To Contact Info App";
	}
}
