package com.example.demo.AnimalsAPI.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.AnimalsAPI.data.AnimalsAPIData;
import com.example.demo.AnimalsAPI.service.AnimalsAPIService;

@Controller
public class AnimalsAPIController {

	private final AnimalsAPIService animalsAPIService;

	public AnimalsAPIController(AnimalsAPIService animalsAPIService) {

		this.animalsAPIService = animalsAPIService;
	}

	@GetMapping("animalsSearch")
	public String animalsSearch(Model model) throws IOException {

		List<AnimalsAPIData> animalsList = animalsAPIService.getAnimalsAPIData();

		model.addAttribute("animalsList", animalsList);

		return "animalsSearch.html";

	}

	@GetMapping("animalsDetails")
	public String animalDetails(@RequestParam("animalId") String animalId, Model model) throws IOException {

		List<AnimalsAPIData> matchingAnimalsList = animalsAPIService.getSelectedAnimalsAPIData(animalId);

		model.addAttribute("matchingAnimalsList", matchingAnimalsList);

		return "animalsDetails.html";

	}

}