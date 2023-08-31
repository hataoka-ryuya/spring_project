package com.example.demo.minus.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.minus.service.MinusService;

@Controller
public class MinusController {
 
	private final MinusService minusService;
	
	public MinusController(MinusService minusService) {
		this.minusService = minusService;
	}	
	@GetMapping("minus")
	public String subtraction() {
		return "minus.html";
	}
 
	@PostMapping("subtraction")
	public String subtraction(@RequestParam("num1") String num1, @RequestParam("num2") String num2, Model model) {
 
		int result = minusService.minusService(num1,num2);

		model.addAttribute("result", result);
 
		return "minus.html";
	}
}