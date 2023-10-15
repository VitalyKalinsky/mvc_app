package ru.web.mvc_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoromirController {
	
	@GetMapping("/odns")
	public String odnsPage() {
		System.out.println("AAA!!");
		return "boromir/odns";
	}
	@GetMapping("/mwa")
	public String mwaPage() {
		return "boromir/mwa";
	}
}
