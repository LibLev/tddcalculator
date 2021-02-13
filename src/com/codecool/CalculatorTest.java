package com.codecool;

import org.junit.jupiter.api.*;

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
    public void testDivision() throws Exception {
        assertEquals(1, calculator.division(1,1));
    }

    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {
        Assumptions.assumeTrue(System.getProperty("os.name").contains("Linux"));

        assertEquals(calculator.multiplication(0,5), 0, "Multiple with zero should be zero");
        assertEquals(calculator.multiplication(5,0), 0, "Multiple with zero should be zero");
    }

    @Test// Expected this exc
    public void testDivideWhenDivisorIsZero() {
        assertThrows(ArithmeticException.class, () -> calculator.division(1, 0));
    }

}