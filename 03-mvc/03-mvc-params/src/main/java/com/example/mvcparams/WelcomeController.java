package com.example.mvcparams;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WelcomeController {

    @GetMapping("/hello")
    @ResponseBody
    String hello(@RequestParam(required = false, defaultValue = "stranger") String name,
                 @RequestHeader("User-Agent") String userAgent) {
        System.out.println("User Agent klienta: " + userAgent);
        return "Hello " + name;
    }
}
