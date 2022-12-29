package com.example.exercise10;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
class BodyWeightController {
    private static final String BMI_INVALID_WEIGHT_HEIGHT =
            "invalid data, weight and height parameters must be positive numbers";
    private static final String BMR_INVALID_WEIGHT_HEIGHT_AGE =
            "invalid data, weight, height and age parameters must be positive numbers";
    private static final String BMR_INVALID_GENDER =
            "invalid data, gender parameter must be man or woman";

    private final BodyWeightCalculator bodyWeightCalculator;

    public BodyWeightController(BodyWeightCalculator bodyWeightCalculator) {
        this.bodyWeightCalculator = bodyWeightCalculator;
    }

    @GetMapping(value = "/bmi", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE})
    ResponseEntity<BMIDto> calculateBMIJson(@RequestParam double weight,
                                            @RequestParam double height) {
        if (constrainsNonPositiveNumber(weight, height)) {
            return ResponseEntity.badRequest()
                    .header("reason", BMI_INVALID_WEIGHT_HEIGHT)
                    .build();
        }
        int bmi = bodyWeightCalculator.calculateBmi(weight, height);
        BMIDto bmiResponse = new BMIDto(weight, height, bmi);
        return ResponseEntity.ok(bmiResponse);
    }

    @GetMapping(value = "/bmr/{gender}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE})
    ResponseEntity<BMRDto> calculateBMRJson(@RequestParam double weight,
                                            @RequestParam double height,
                                            @RequestParam int age,
                                            @PathVariable String gender) {
        if (constrainsNonPositiveNumber(weight, height, age)) {
            return ResponseEntity.badRequest()
                    .header("reason", BMR_INVALID_WEIGHT_HEIGHT_AGE)
                    .build();
        } else if (isIncorrectGenderValue(gender)) {
            return ResponseEntity.badRequest()
                    .header("reason", BMR_INVALID_GENDER)
                    .build();
        }
        int bmr = bodyWeightCalculator.calculateBmr(weight, height, age, gender);
        BMRDto bmrResponse = new BMRDto(gender, weight, height, age, bmr);
        return ResponseEntity.ok(bmrResponse);
    }

    private boolean constrainsNonPositiveNumber(double... params) {
        for (double param : params) {
            if (param <= 0) {
                return true;
            }
        }
        return false;
    }

    private boolean isIncorrectGenderValue(String gender) {
        return !gender.equals("man") && !gender.equals("woman");
    }

}
