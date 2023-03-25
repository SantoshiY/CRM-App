package com.crmapp.service;

import java.util.List;

import com.crmapp.dto.contactDto;
import com.crmapp.entity.Contact;

public interface ContactService {
	public void saveContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getContactById(long id);

	public void deleteById(long id);

	public Contact findContactById(long id);

	public Contact updateContact(contactDto cdto);


}
