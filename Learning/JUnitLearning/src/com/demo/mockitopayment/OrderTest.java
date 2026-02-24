package com.demo.mockitopayment;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OrderTest {
    @Mock
    Payment payment;

    @Test
    public void testProcessOrder() {
        when(payment.processPayment(100.0)).thenReturn(true);
        
        Order order = new Order("001", 100.0, payment);
        boolean result = order.processOrder();
        
        assertTrue(result);
    }
}
