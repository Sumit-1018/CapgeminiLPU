package com.demo.practicetest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestLoginValidation {
	@Test
	public void testLoginValidation() {
		assertTrue(LoginValidation.validateLogin("admin", "password123"));
	}
}
