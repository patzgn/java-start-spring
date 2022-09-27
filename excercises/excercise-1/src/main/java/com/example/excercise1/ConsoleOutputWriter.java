package com.example.excercise1;

import com.example.excercise1.formatter.TextFormatter;
import org.springframework.stereotype.Component;

@Component
public class ConsoleOutputWriter {
    private final TextFormatter textFormatter;

    public ConsoleOutputWriter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    void println(String text) {
        String formattedText = textFormatter.format(text);
        System.out.println(formattedText);
    }
}
