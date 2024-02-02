package com.skypro.testing;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public long addTwoNumbers(int num1, int num2) {

        int result = num1 + num2;
        return result;
    }

    @Override
    public long subtractTwoNumbers(int num1, int num2) {

        int result = num1 - num2;
        return result;

    }

    @Override
    public long multiplyTwoNumbers(int num1, int num2) {

        int result = num1 * num2;
        return result;

    }
    public double divideTwoNumbers(int num1, int num2) {

        double result = (double) num1 / num2;

        return result;

    }
}