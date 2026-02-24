package com.demo.calculator;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
	
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2, 3);
		assertEquals(5, result);
		assertTrue(result == 5);
	}
	@Test
	public void testSubtract() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(5, 2);
		assertEquals(3, result);
	}
	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(4, 3);
		assertEquals(12, result);
	}
	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		int result = calculator.divide(10, 2);
		assertEquals(5, result);
	}
	@Test
	public void testDivideByZero() {
		Calculator calculator = new Calculator();
		assertThrows(IllegalArgumentException.class, () -> {
			calculator.divide(10, 0);
		});
	}
	
	
	@Spy
	Calculator calculator;
	
	@Test
	void spyExample() {
		// Spy on the add method to return a specific value
		doReturn(100).when(calculator).multiply(10, 5);
		
		//add method will execute real logic
		int addResult = calculator.add(10, 5);
		assertEquals(15, addResult);
		
		//multiply is overridden to return 100
		int multiplyResult = calculator.multiply(10, 5);
		assertEquals(100, multiplyResult);
	}
}
