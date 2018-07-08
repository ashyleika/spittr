package com.ashyleika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

	@RequestMapping("/register")
	public String showRegistrationForm() {
		return "registerForm";
	}
	
}
