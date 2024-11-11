package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.constants.CalculatorServiceTestConstants;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.calculator.constants.CalculatorServiceTestConstants.*;

public class CalculatorServiceTest {
    private final CalculatorService out = new CalculatorServiceImpl();

    @Test
    public void testAddingNumbers() {
        String result1 = out.addingNumbers(number1, number2);
        String expected1 = valueOfAddition1;
        assertEquals(expected1, result1);


        String result2 = out.addingNumbers(number3, number4);
        String expected2 = result2;
        assertEquals(valueOfAddition2, expected2);
    }

    @Test
    public void testDeduction() {
        String result1 = out.deduction(number1, number2);
        String expected1 = valueOfSubtraction1;
        assertEquals(expected1, result1);


        String result2 = out.deduction(number3, number4);
        String expected2 = valueOfSubtraction2;
        assertEquals(expected2, result2);
    }

    @Test
    public void testMultiply() {
        String result1 = out.multiply(number1, number2);
        String expected1 = valueOfMultiplication1;
        assertEquals(expected1, result1);

        String result2 = out.multiply(number3, number4);
        String expected2 = valueOfMultiplication2;
        assertEquals(expected2, result2);
    }

    @Test
    public void testDivide() throws IllegalAccessException {
        String result1 = out.divide(number1, number2);
        String expected1 = valueOfDivision1;
        assertEquals(expected1, result1);

        String result2 = out.divide(number3, number4);
        String expected2 = valueOfDivision2;
        assertEquals(expected2, result2);


        assertThrows(IllegalAccessException.class, () ->
                out.divide(number3, 0)
        );
    }
}
