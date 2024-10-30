package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String sayHello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/calculator/plus")
    public String adding(@RequestParam("num1") int firstNumber, @RequestParam("num2") int secondNumber) {
        return calculatorService.addingNumbers(firstNumber, secondNumber);
    }

    @GetMapping(path = "/calculator/minus")
    public String deduction(@RequestParam("num1") int firstNumber, @RequestParam("num2") int secondNumber) {
        return calculatorService.deduction(firstNumber, secondNumber);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int firstNumber, @RequestParam("num2") int secondNumber) {
        return calculatorService.multiply(firstNumber, secondNumber);
    }
//
//    @GetMapping(path = "/calculator/divide")
//    public String divide(@RequestParam("num1") int firstNumber, @RequestParam("num2") int secondNumber) throws IllegalAccessException {
//        return calculatorService.divide(firstNumber, secondNumber);
//    }
}
