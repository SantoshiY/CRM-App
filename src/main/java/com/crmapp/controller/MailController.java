package com.crmapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.dto.emailDto;
import com.crmapp.util.EmailService;



@Controller
public class MailController {
	
	@Autowired
	private EmailService es;
	
	@RequestMapping("/sentMail")
	public String sendMail(@RequestParam("email") String email, Model model) {//here we are reading the email form lead_info.jsp
		
		model.addAttribute("email", email);  //this line help us to show email in email box in compose.jsp
		return "compose_mail";
	}
	@RequestMapping("/sent")
	public String sent(emailDto dto, Model m) {
		es.sendEmail(dto.getTo(), dto.getSubject(), dto.getContent());
		m.addAttribute("done", "Mail sent successfully!!!");
		return "compose_mail";
	}
	
	
	
	
}
