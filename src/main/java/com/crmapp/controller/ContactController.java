package com.crmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.dto.contactDto;
import com.crmapp.entity.Contact;
import com.crmapp.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService cs;
	
	//http://localhost:8080/crmapp/allContacts
	
	
	@RequestMapping("/allContacts")
	public String getAllContacts(Model m) {
		List<Contact> allContacts = cs.getAllContacts();
		m.addAttribute("contacts", allContacts);
		return "list_contact";
	}
	
	@RequestMapping("/deleteContact")
	public String deleteLead(@RequestParam("id") long id, Model m) {
		cs.deleteById(id);
		
		List<Contact> allContacts = cs.getAllContacts();
		m.addAttribute("contacts", allContacts);
		return "list_contact";
	}
	
	@RequestMapping("/contactInfo")
	public String leadInfo(@RequestParam("id") long id, Model m) {
		Contact cont = cs.findContactById(id);
		m.addAttribute("cont", cont);
		return "contact_info";
	}
	
	@RequestMapping("/updateContact")
	public String updateContact(@RequestParam("id") long id, ModelMap m) {
		Contact c = cs.findContactById(id);//(save method in crud)save and update data in crud operations
		m.addAttribute("contact", c);
		
		return "contact_update";
	}
	
	@RequestMapping("/contactUpdated")
	public String contactUpdated(contactDto cdto, Model m) {
		cs.updateContact(cdto);
		
		Contact cont = cs.findContactById(cdto.getId());
		m.addAttribute("cont", cont);
		return "contact_info";
		
	}

}
