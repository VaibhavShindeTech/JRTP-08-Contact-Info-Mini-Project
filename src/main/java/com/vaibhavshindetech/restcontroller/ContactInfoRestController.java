package com.vaibhavshindetech.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhavshindetech.bindings.ContactForm;
import com.vaibhavshindetech.service.ContactService;

@RestController
public class ContactInfoRestController {
	@Autowired
	private ContactService contactService;

	@PostMapping(value = "/save")
	public String saveContact(@RequestBody ContactForm contactForm) {
		return contactService.saveContact(contactForm);
	}
	@GetMapping(value = "/contacts")
	public List<ContactForm> viewContacts() {
		return contactService.viewContacts();
	}
	@GetMapping(value = "/edit/{contactId}")
	public ContactForm editContact(@PathVariable Integer contactId) {
		return contactService.editContact(contactId);
	}
	@DeleteMapping(value = "/delete/{contactId}")
	public List<ContactForm> deleteContact(@PathVariable Integer contactId) {
		return contactService.deleteContact(contactId);
	}

}
