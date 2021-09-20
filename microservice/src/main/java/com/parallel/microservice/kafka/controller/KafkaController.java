package com.parallel.microservice.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.parallel.microservice.kafka.service.ProducerService;
import com.parallel.microservice.model.MessageTo;

@Controller
public class KafkaController {

	@Autowired
	private ProducerService sender;
	
	@GetMapping("/producer")
	public String producerForm(Model model) {
		model.addAttribute("message", new MessageTo());
		return "producer";
	}

	@PostMapping("/producer")
	public String producerSubmit(@ModelAttribute MessageTo message, Model model) {
		model.addAttribute("message", message);
		this.sender.send(message.getJsonStr());
		return "result";
	}
}
