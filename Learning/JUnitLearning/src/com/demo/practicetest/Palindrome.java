package com.demo.practicetest;

public class Palindrome {
	public static boolean isPalindrome(String str) {
		String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
		return cleanedStr.equals(reversedStr);
	}
}
