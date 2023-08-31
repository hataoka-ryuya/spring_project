package com.example.demo.fizzBuzz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
	
//	public static void fizzBuzzService() {
		
		public List<string> createFizzBuzz() {
			List<string> result = new ArrayList<>();
		
			for (int i = 0; i <= 100; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					result.add("Fizz Buzz");
				} else if (i % 3 == 0) {
					result.add("Fizz");
				} else if (i % 5 == 0) {
					result.add("Buzz");
				} else {
					result.add(i);
				}
			}
//		}
		return result;
	}
}