package com.example.exercise9;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class DataController {
    private final DataGenerationService dataGenerationService;

    public DataController(DataGenerationService dataGenerationService) {
        this.dataGenerationService = dataGenerationService;
    }

    @PostMapping("/generate-data")
    String generateData(@RequestParam int size,
                        @RequestParam String language,
                        @RequestParam(required = false) boolean firstName,
                        @RequestParam(required = false) boolean lastName,
                        @RequestParam(required = false) boolean university,
                        @RequestParam(required = false) boolean country,
                        Model model) {
        Map<String, List<String>> data = dataGenerationService
                .generateFakeData(size, language, firstName, lastName, university, country);
        model.addAttribute("data", data);
        model.addAttribute("size", size);
        return "data-table";
    }
}
