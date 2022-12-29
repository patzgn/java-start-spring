package com.example.exercise10;

import org.springframework.stereotype.Service;

@Service
class BodyWeightCalculator {
    private final int BMR_CONSTANT_MAN = 5;
    private final int BMR_CONSTANT_WOMAN = -161;

    int calculateBmi(double weight, double height) {
        return (int) (weight / Math.pow(height / 100, 2));
    }

    int calculateBmr(double weight, double height, int age, String gender) {
        int s = switch (gender) {
            case "man" -> BMR_CONSTANT_MAN;
            case "woman" -> BMR_CONSTANT_WOMAN;
            default -> throw new IllegalArgumentException("Invalid gender " + gender);
        };
        return (int) (10 * weight + 6.25 * height - age + s);
    }
}
