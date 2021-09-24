package com.parallel.microservice.jms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.parallel.microservice.model.MessageTo;

@Controller
public class SenderController {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@GetMapping("/sender")
	public String senderForm(Model model) {
		model.addAttribute("message", new MessageTo());
		return "sender";
	}

	@PostMapping("/sender")
	public String senderSubmit(@ModelAttribute MessageTo message, Model model) {
		model.addAttribute("message", message);
		this.jmsTemplate.convertAndSend("DEV.QUEUE.1", message.getJsonStr());
		return "result-ibm";
	}	
}
