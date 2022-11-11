package com.example.exercise7;


import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;
import org.springframework.stereotype.Service;

@Service
public class CodeFormatterService {

    String formatCode(String source) throws FormatterException {
        return new Formatter().formatSource(source);
    }
}
