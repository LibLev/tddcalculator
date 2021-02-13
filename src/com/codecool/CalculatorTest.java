package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple addition should work")
    public void testAddition() {
        assertEquals(2, calculator.addition(1,1));
    }

    @Test
    @DisplayName("Simple subtraction should work")
    public void testSubtraction() {
        assertEquals(0, calculator.subtraction(1,1));
    }

    @Test
    @DisplayName("Simple multiplication should work")
    public void testMultiplication() {
        assertEquals(1, calculator.multiplication(1,1));
    }

    @Test
    @DisplayName("Simple division should work")
    public void testDivisin() {
        assertEquals(1, calculator.division(1,1));
    }

}