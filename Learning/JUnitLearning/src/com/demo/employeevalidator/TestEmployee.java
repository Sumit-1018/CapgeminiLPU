package com.demo.employeevalidator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmployee {
	@Test
	public void validateNameValidTest1() {
		String name = "Sam Johns";
		Validator validator = new Validator();
		assertTrue(validator.validateName(name));
	}
	@Test
	public void validateNameInvalidTest1() {
		String name = "Jonathan";
		Validator validator = new Validator();
		assertFalse(validator.validateName(name));
	}
	@Test
	public void AgeValidTest1() {
		int age = 18;
		Validator validator = new Validator();
		assertTrue(validator.validateAge(age));
	}
	@Test
	public void AgeInvalidTest1() {
		int age = 60;
		Validator validator = new Validator();
		assertTrue(validator.validateAge(age));
	}
	@Test
	public void validateInvalidNameTest() {
		Employee employee = new Employee("Maria", 2000, 25);
		 Validator validator = new Validator();
		 assertThrows(InvalidNameException.class, () -> {
			 validator.validate(employee);
		 });
	}
	@Test
	public void validateInvalidAgeTest() {
		Employee employee = new Employee("Maria Francis", 2000, 17);
		 Validator validator = new Validator();
		 assertThrows(InvalidAgeException.class, () -> {
			 validator.validate(employee);
		 });
	}
	@Test
	public void calculateAnnualSalaryValidTest1() {
		Employee employee = new Employee("Maria Francis", 2000, 18);
		assertEquals(25440, employee.calculateAnnualSalary(),0.001);
	}

}
