package com.example.demo.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public int calculatorService(int num1, int num2, String mark) {
		int result = 0;

		if ("plus".equals(mark)) {
			result = num1 + num2;
		} else if ("minus".equals(mark)) {
			result = num1 - num2;
		} else if ("apply".equals(mark)) {
			result = num1 * num2;
		} else if ("divide".equals(mark)) {
			result = num1 / num2;
		}

		return result;
	}
}