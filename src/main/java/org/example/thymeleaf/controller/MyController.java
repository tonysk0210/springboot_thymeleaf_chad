package org.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;

@Controller
public class MyController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("localTime", LocalTime.now());
        return "home";
    }
}
