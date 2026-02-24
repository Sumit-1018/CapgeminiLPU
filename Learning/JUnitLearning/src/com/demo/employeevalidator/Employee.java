package com.demo.employeevalidator;

public class Employee {
	private String name;
	private double monthlySalary;
	private int age;
	public Employee(String name, double salary, int age) {
		this.name = name;
		this.monthlySalary = salary;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return monthlySalary;
	}
	public void setSalary(double salary) {
		this.monthlySalary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double calculateAnnualSalary() {
		if(age>=18 && age <=50) {
			return (monthlySalary * 12 * 1.06); 
		}
		else{
			return  (monthlySalary * 12 * 1.07);
		}
	}
}
