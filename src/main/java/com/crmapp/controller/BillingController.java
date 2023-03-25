package com.crmapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.entity.Billing;
import com.crmapp.entity.Contact;
import com.crmapp.service.BillingService;
import com.crmapp.service.ContactService;

@Controller
public class BillingController {
		
	@Autowired
	private ContactService cs;
	
	@Autowired
	private BillingService bs;
	
	@RequestMapping("/generateBill")
	public String viewBillingPage(@RequestParam("id") long id, Model m) {
		Contact contact = cs.getContactById(id);
		m.addAttribute("contact", contact);
		return "generate_bill";
	}
	
	@RequestMapping("/billGenerated")
	public String generateBill(@ModelAttribute("bill") Billing bill,@RequestParam("email") String email, Model m) {
		bs.generateBill(bill);
		
		m.addAttribute("email", email);
		
		return "compose_mail";
	}
}
