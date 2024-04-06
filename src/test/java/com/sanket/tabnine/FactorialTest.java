package com.sanket.tabnine;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testCalculateFactorial_Zero() {
        Factorial factorial = new Factorial();
        assertEquals(1, factorial.calculateFactorial(0));
    }

    @Test
    void testCalculateFactorial_One() {
        Factorial factorial = new Factorial();
        assertEquals(1, factorial.calculateFactorial(1));
    }

    @Test
    void testCalculateFactorial_PositiveNumber() {
        Factorial factorial = new Factorial();
        assertEquals(120, factorial.calculateFactorial(5));
    }

    @Test
    void testCalculateFactorial_NegativeNumber() {
        Factorial factorial = new Factorial();
        assertThrows(IllegalArgumentException.class, () -> factorial.calculateFactorial(-5));
    }
}