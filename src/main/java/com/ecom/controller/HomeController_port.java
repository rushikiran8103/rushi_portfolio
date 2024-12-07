package com.ecom.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController_port{
	
	@GetMapping("/")
	
	public String base_port() 
	{
		return "base_port";
		
	}
	
	@GetMapping("/resume")
	public String resume() {
		return "resume";
	}
}