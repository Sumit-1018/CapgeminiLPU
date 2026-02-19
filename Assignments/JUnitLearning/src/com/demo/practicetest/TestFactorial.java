package com.demo.practicetest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFactorial {
	@Test
	public void testFactorial() {
		assertEquals(1, Factorial.factorial(0));
		assertEquals(1, Factorial.factorial(1));
		assertEquals(2, Factorial.factorial(2));
	}
}
