package com.vaibhavshindetech.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactInfoRestController {
	@GetMapping(value = "/welcome")
	public String greetMsg() {
		return "<h1>Welcome To Contact Info App Today i have implemented service class</h1>";
	}
}
