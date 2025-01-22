package org.example.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddPositives() {
        int result = Calculator.addTwoNumbers(5, 40);
        assertEquals(45, result);
    }

    @Test
    public void testAddNegatives() {
        int result = Calculator.addTwoNumbers(-4, -50);
        assertEquals(-54, result);
    }

    @Test
    public void testAddMixed() {
        int result = Calculator.addTwoNumbers(5, -5);
        assertEquals(0, result);
    }
}
