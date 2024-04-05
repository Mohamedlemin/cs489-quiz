package com.quiz.domain;


import java.util.ArrayList;
import java.util.List;

public class Contact {
	private String firstName;
	private String lastName;
	private String company;
	private String jobTitle;
	private List<PhoneNumber> phoneNumbers;
	private List<EmailAddress> emailAddresses;

	public Contact(String firstName, String lastName, String company, String jobTitle) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		this.jobTitle = jobTitle;
		this.phoneNumbers = new ArrayList<>();
		this.emailAddresses = new ArrayList<>();
	}

	public String getLastName() {
		return lastName;
	}

	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public List<EmailAddress> getEmailAddresses() {
		return emailAddresses;
	}
}