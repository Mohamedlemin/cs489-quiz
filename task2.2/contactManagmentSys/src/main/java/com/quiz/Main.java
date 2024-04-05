package com.quiz;
import  com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.quiz.domain.Contact;
import com.quiz.domain.EmailAddress;
import com.quiz.domain.PhoneNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Contact> contacts = new ArrayList<>();

		Contact davidSanger = new Contact("David", "Sanger", "Argos LLC", "Sales Manager");
		davidSanger.getPhoneNumbers().add(new PhoneNumber("240-133-0011", "Home"));
		davidSanger.getPhoneNumbers().add(new PhoneNumber("240-112-0123", "Mobile"));
		davidSanger.getEmailAddresses().add(new EmailAddress("dave.sang@gmail.com", "Home"));
		davidSanger.getEmailAddresses().add(new EmailAddress("dsanger@argos.com", "Work"));
		contacts.add(davidSanger);

		Contact carlosJimenez = new Contact("Carlos", "Jimenez", "Zappos", "Director");
		contacts.add(carlosJimenez);

		Contact aliGafar = new Contact("Ali", "Gafar", "BMI Services", "HR Manager");
		aliGafar.getPhoneNumbers().add(new PhoneNumber("412-116-9988", "Work"));
		aliGafar.getEmailAddresses().add(new EmailAddress("ali@bmi.com", "Work"));
		contacts.add(aliGafar);

		Collections.sort(contacts, Comparator.comparing(Contact::getLastName));

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonContacts = gson.toJson(contacts);

		System.out.println(jsonContacts);
	}
}









