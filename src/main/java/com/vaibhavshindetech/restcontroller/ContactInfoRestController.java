package com.vaibhavshindetech.restcontroller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhavshindetech.bindings.ContactForm;
import com.vaibhavshindetech.service.ContactService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class ContactInfoRestController {
	@Autowired
	private ContactService contactService;

	@PostMapping(value = "/contacts")
	public Map<String, String> saveContact(@RequestBody ContactForm contactForm) {
		return contactService.saveContact(contactForm);
	}
	@GetMapping(value = "/contacts")
	public List<ContactForm> viewContacts() {
		System.out.println("**viewContacts method invoked**");
		return contactService.viewContacts();
	}
	@GetMapping(value = "/contacts/{contactId}")
	public ContactForm editContact(@PathVariable Integer contactId) {
		return contactService.editContact(contactId);
	}
	@DeleteMapping(value = "/contacts/{contactId}")
	public List<ContactForm> deleteContact(@PathVariable Integer contactId) {
		return contactService.deleteContact(contactId);
	}

}
