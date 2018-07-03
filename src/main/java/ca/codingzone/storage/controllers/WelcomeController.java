package ca.codingzone.storage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
	public String welcome(ModelMap model) {
		model.addAttribute("message", "welcome");
		model.addAttribute("active", "Overview");
		return "welcome";
	}
}
