package com.example.exercise4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class TimeController {
    @RequestMapping("/current-time")
    @ResponseBody
    String currentTime() {
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("y-M-d k:m:s");
        return LocalDateTime.now().format(dateTimeFormatter);
    }

    @RequestMapping("/current-year")
    @ResponseBody
    String currentYear() {
        return String.valueOf(LocalDate.now().getYear());
    }
}
