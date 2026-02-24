package com.demo.mockitopayment;

public class Order {
	private String orderId;
	private double amount;
	private Payment payment;
	
	public Order(String orderId, double amount, Payment payment) {
		this.orderId = orderId;
		this.amount = amount;
		this.payment = payment;
	}
	public boolean processOrder() {
		if(amount<=0) {
			return false;
		}
		return payment.processPayment(amount);
		
	}
	public String getOrderId() {
		return orderId;
	}
	public double getAmount() {
		return amount;
	}
}
