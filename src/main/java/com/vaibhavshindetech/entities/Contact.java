package com.vaibhavshindetech.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CONTACT_DTLS")
public class Contact {
	@Id
	@Column(name = "CONTACT_ID")
	@GeneratedValue
	private Integer contactId;
	@Column(name = "CONTACT_NAME")
	private String contactName;
	@Column(name = "CONTACT_EMAIL")
	private String contactEmail;
	@Column(name = "CONTACT_NUMBER")
	private Long contactPhone;
	@Column(name = "CONTACT_STATUS")
	private Boolean contactStatus;
	@Column(name = "CREATED_DATE")
	@CreationTimestamp
	private LocalDate contactCreatedDate;
	@Column(name = "UPDATED_DATE")
	@UpdateTimestamp
	private LocalDate contactUpdatedDate;

}