package com.example.demo.fizzBuzz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FizzBuzzController {

	private final FizzBuzzController fizzBuzzService;

	public FizzBuzzController(FizzBuzzService fizzBuzzService) {
		this.fizzBuzzService = fizzBuzzService;
	}

	@GetMapping("fizzBuzz")
	public String fizzBuzz(Model model) {

		String result = "";

//		result = String.valueOf(multiService.multi(5, 6));

		model.addAttribute("result", list);

		return "fizzBuzz.html";
	}

}

