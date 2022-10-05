package com.example.mvcparams;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CalculatorController {

    @GetMapping("/add")
    @ResponseBody
    String add(@RequestParam double a, @RequestParam double b) {
        double sum = a + b;
        return String.format("%.2f + %.2f = %.2f", a, b, sum);
    }
}
