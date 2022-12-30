package com.example.securitycontext.web;

import com.example.securitycontext.message.WelcomeMessageService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class HomeController {
    private final WelcomeMessageService welcomeMessageService;

    public HomeController(WelcomeMessageService welcomeMessageService) {
        this.welcomeMessageService = welcomeMessageService;
    }

    @GetMapping("/")
    String home(@RequestParam(defaultValue = "en") String lang,
                Model model) {
        String welcomeMessage = welcomeMessageService.getWelcomeMessage(lang);
        model.addAttribute("welcomeMessage", welcomeMessage);
        return "index";
    }
}
