package com.crmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.entity.Contact;
import com.crmapp.entity.Lead;
import com.crmapp.service.ContactService;
import com.crmapp.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService ls;
	
	@Autowired
	private ContactService cs;
	
	//http://localhost:8080/crmapp/view
	
	@RequestMapping("/view")
	public String viewCreateLeadPage() {
		return "create_lead";
	}
	
	@RequestMapping("/save")
	public String saveLead(@ModelAttribute("lead") Lead lead, Model model) {
		ls.saveLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@PostMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id, @RequestParam("email") String email,Model model) {
		Lead lead = ls.findLeadById(id);
		
		Contact c = new Contact();
		c.setFirstName(lead.getFirstName());
		c.setLastName(lead.getLastName());
		c.setEmail(lead.getEmail());
		c.setMobile(lead.getMobile());
		c.setSource(lead.getSource());
		
		cs.saveContact(c);
		
		ls.deleteById(id);
		
		model.addAttribute("email", email);
		
		return "compose_mail";
	}
	
	//http://localhost:8080/crmapp/listAll
	@RequestMapping("/listAll")
	public String listAllLeads(Model model) {
		List<Lead> allLeads = ls.getAllLeads();
		model.addAttribute("leads", allLeads);
		return "list_leads";
		
	}
	
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id, Model m) {
		Lead lead = ls.findLeadById(id);
		m.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping("/deleteLead")
	public String deleteLead(@RequestParam("id") long id) {
		ls.deleteById(id);
		return "create_lead";
	}

}
