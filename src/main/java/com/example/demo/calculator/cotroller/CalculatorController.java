package com.example.demo.calculator.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.calculator.service.CalculatorService;

@Controller
public class CalculatorController {

	private final CalculatorService calculatorService;

	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@GetMapping("calculator")
	public String calcultion() {
		return "calculator.html";
	}

	@PostMapping("calculatorResult")
	public String calculation(@RequestParam("num1") int num1, @RequestParam("num2") int num2,
			@RequestParam("mark") String mark, Model model) {

		int result = calculatorService.calculatorService(num1, num2, mark);

		model.addAttribute("result", result);

		return "calculator.html";
	}
}