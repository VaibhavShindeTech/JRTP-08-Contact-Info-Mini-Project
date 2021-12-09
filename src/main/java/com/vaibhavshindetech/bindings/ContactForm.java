package com.vaibhavshindetech.bindings;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ContactForm {
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long contactPhone;
	private LocalDate contactCreatedDate;
	private LocalDate contactUpdatedDate;
	private Boolean contactStatus;

}
