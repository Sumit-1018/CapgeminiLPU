package com.demo.calculator;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.InjectMocks;
import org.mockito.Mock;

@ExtendWith(MockitoExtension.class)
public class AgeValidatorTest {
	@Mock
	Database db;
	
	@InjectMocks
	AgeValidator validator;
	
	@Test
	void testInvalidAge() {
		assertThrows(IllegalArgumentException.class, () -> {
			validator.validateAge(-1);
		});
	}

}
