package com.sanket.tabnine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearCheckerTest {

    @Test
    public void testIsLeapYear_2024_ReturnsTrue() {
        assertEquals(true, LeapYearChecker.isLeapYear(2024));
    }

    @Test
    public void testIsLeapYear_2000_ReturnsTrue() {
        assertEquals(true, LeapYearChecker.isLeapYear(2000));
    }

    @Test
    public void testIsLeapYear_1900_ReturnsFalse() {
        assertEquals(false, LeapYearChecker.isLeapYear(1900));
    }

    @Test
    public void testIsLeapYear_2100_ReturnsFalse() {
        assertEquals(false, LeapYearChecker.isLeapYear(2100));
    }
}