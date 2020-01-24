package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		return "Home";
	}
	
	@RequestMapping("/projetos")
	public String projetos() {
		return"Projetos";
	}
	
	@RequestMapping("/skills")
	public String skills() {
		return "Skills";
	}
	
	@RequestMapping("/contatos")
	public String contatos() {
		return "Contatos";
	}
}
