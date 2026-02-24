package com.demo.practicetest;

public class LoginValidation {
	String validUsername = "admin";
	String validPassword = "password123";
	public static boolean validateLogin(String username, String password) {
		if(username==null || password == null) {
			throw new IllegalArgumentException("Username and password cannot be null");
		}
		if(username.equals("admin") && password.equals("password123")) {
			return true;
		}
		return false;
		
	}
}
