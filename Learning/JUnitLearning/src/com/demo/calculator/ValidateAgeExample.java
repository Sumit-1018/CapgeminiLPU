package com.demo.calculator;

public class ValidateAgeExample {
	void validateAge(int age) {
		if(age<0) {
			throw new IllegalArgumentException("Age cannot be negative");
		}
	}
}
