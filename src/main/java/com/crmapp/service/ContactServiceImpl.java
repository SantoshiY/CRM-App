package com.crmapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmapp.dto.contactDto;
import com.crmapp.entity.Contact;
import com.crmapp.repository.ContactRepo;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepo cr;

	@Override
	public void saveContact(Contact contact) {
		cr.save(contact);
		
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> findAll = cr.findAll();
		return findAll;
	}

	@Override
	public Contact getContactById(long id) {
		Optional<Contact> f = cr.findById(id);
		Contact contact = f.get();
		return contact;
	}

	@Override
	public void deleteById(long id) {
		cr.deleteById(id);
		
	}

	@Override
	public Contact findContactById(long id) {
		Optional<Contact> f = cr.findById(id);
		Contact cont = f.get();
		return cont;
	}

	@Override
	public Contact updateContact(contactDto cdto) {
		Contact c = new Contact();
		c.setId(cdto.getId());
		c.setFirstName(cdto.getFirstName());
		c.setLastName(cdto.getLastName());
		c.setEmail(cdto.getEmail());
		c.setMobile(cdto.getMobile());
		c.setSource(cdto.getSource());
		Contact updatedContact = cr.save(c);
		return updatedContact;
	}
}
