package com.vaibhavshindetech.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhavshindetech.bindings.ContactForm;
import com.vaibhavshindetech.entities.Contact;
import com.vaibhavshindetech.repository.ContactRepository;

@Service
public class ContactServiceImp implements ContactService {
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public String saveContact(ContactForm contactForm) {
		Contact entity = new Contact();
		BeanUtils.copyProperties(contactForm, entity);
		if (entity.getContactId() == null) {
			entity.setContactStatusActive("Y");
			contactRepository.save(entity);
			return "SUCCESS";
		}
		return "FAILURE";
	}

	@Override
	public List<ContactForm> viewContacts() {
		List<ContactForm> dataList = new ArrayList<>();
		List<Contact> findAll = contactRepository.findAll();
		for (Contact contact : findAll) {
			ContactForm contactForm = new ContactForm();
			BeanUtils.copyProperties(contact, contactForm);
			dataList.add(contactForm);
		}
		return dataList;
	}

	@Override
	public ContactForm editContact(Integer contactId) {
		Optional<Contact> findById = contactRepository.findById(contactId);
		if (findById.isPresent()) {
			Contact contact = findById.get();
			ContactForm contactForm = new ContactForm();
			BeanUtils.copyProperties(contact, contactForm);
			return contactForm;
		}
		return null;
	}

	@Override
	public List<ContactForm> deleteContact(Integer contactId) {
		contactRepository.deleteById(contactId);
		List<ContactForm> dataList = new ArrayList<>();
		List<Contact> findAll = contactRepository.findAll();
		for (Contact contact : findAll) {
			ContactForm contactForm = new ContactForm();
			BeanUtils.copyProperties(contact, contactForm);
			dataList.add(contactForm);
		}
		return dataList;
	}

}
