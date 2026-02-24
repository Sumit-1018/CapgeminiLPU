package com.demo.employeevalidator;

public class Validator {
	public boolean validateName(String name) {
		if(name == null) {
			return false;
		}else if(name.length() > 8) {
			return true;
		}
		return false;
	}
	
	public boolean validateAge(int age) {
		if(age >= 18 && age <= 60) {
			return true;
		}
		return false;
	}
	
	public void validate(Employee employee) throws InvalidNameException, InvalidAgeException {
		if(employee == null) {
			throw new IllegalArgumentException("Employee cannot be null");
		}
		if(!validateName(employee.getName())){
			throw new InvalidNameException("Invalid name: " + employee.getName());
		}
		if(!validateAge(employee.getAge())) {
			throw new InvalidAgeException("Invalid age: " + employee.getAge());
		}
	}
}
