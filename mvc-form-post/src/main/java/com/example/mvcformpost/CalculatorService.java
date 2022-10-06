package com.example.mvcformpost;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    static double calculate(double a, double b, String operator) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("Nieobsługiwany operator matematyczny");
        };
    }
}
