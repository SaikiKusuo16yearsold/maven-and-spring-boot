package pro.sky.calculator.service;

public interface CalculatorService {
    String hello();

    String addingNumbers(int number1, int number2);

    String deduction(int number1, int number2);

    String multiply(int number1, int number2);

    String divide(int number1, int number2) throws IllegalAccessException;
}
