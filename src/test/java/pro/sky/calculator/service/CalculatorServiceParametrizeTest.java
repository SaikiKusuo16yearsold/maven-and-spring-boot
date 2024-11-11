package pro.sky.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.calculator.constants.CalculatorServiceTestConstants.*;

public class CalculatorServiceParametrizeTest {
    private final CalculatorService out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForAdditionTests")
    public void testAddingNumbers(int number1, int number2, String answer) {
        String result = out.addingNumbers(number1, number2);
        assertEquals(result, answer);
    }

    public static Stream<Arguments> provideParamsForAdditionTests() {
        return Stream.of(
                Arguments.of(number1, number2, valueOfAddition1),
                Arguments.of(number3, number4, valueOfAddition2)
        );
    }


    @ParameterizedTest
    @MethodSource("provideParamsForDeductionTests")
    public void testDeductionNumbers(int number1, int number2, String answer) {
        String result = out.deduction(number1, number2);
        assertEquals(result, answer);
    }

    public static Stream<Arguments> provideParamsForDeductionTests() {
        return Stream.of(
                Arguments.of(number1, number2, valueOfSubtraction1),
                Arguments.of(number3, number4, valueOfSubtraction2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    public void testMultiplyNumbers(int number1, int number2, String answer) {
        String result = out.multiply(number1, number2);
        assertEquals(result, answer);
    }

    public static Stream<Arguments> provideParamsForMultiplyTests() {
        return Stream.of(
                Arguments.of(number1, number2, valueOfMultiplication1),
                Arguments.of(number3, number4, valueOfMultiplication2)
        );
    }


    @ParameterizedTest
    @MethodSource("provideParamsForDivisionTests")
    public void testDivisionNumbers(int number1, int number2, String answer) throws IllegalAccessException {
        String result = out.divide(number1, number2);
        assertEquals(result, answer);
    }

    public static Stream<Arguments> provideParamsForDivisionTests() {
        return Stream.of(
                Arguments.of(number1, number2, valueOfDivision1),
                Arguments.of(number3, number4, valueOfDivision2)
        );
    }


}
