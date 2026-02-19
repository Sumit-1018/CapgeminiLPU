package com.demo.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TestReverseString {
	@Test
	public void testReverseString() {
		String input = "Hello, World!";
		String expectedOutput = "!dlroW ,olleH";
		String actualOutput = ReverseStringUsingStack.reverseString(input);
		assertEquals(expectedOutput, actualOutput);
	}
}
