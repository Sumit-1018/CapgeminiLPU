package com.demo.calculator;

import java.util.Stack;

public class ReverseStringUsingStack {
	public static String reverseString(String input) {
		Stack stack = new Stack();
		// Push each character of the string onto the stack
		for (int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i));
		}
		StringBuilder reversedString = new StringBuilder();
		// Pop each character from the stack and append to the result
		while(!stack.isEmpty()) {
			reversedString.append(stack.pop());
		}
		
		return reversedString.toString();
	}
}