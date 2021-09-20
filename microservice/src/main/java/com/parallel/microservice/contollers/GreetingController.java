package com.parallel.microservice.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.parallel.microservice.configuration.Config;

@Controller
public class GreetingController {
	
	@Autowired
	private Config configuration;

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("message", this.configuration.getMessage());
		return "greeting";
	}
}
