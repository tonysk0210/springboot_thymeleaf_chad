package org.example.thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    //need a controller method to show the form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    //need a controller method to process the form
    @PostMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormV2")
    //need a controller method to read form data, and then add data to the model.
    public String letsShoutDude(HttpServletRequest request, Model model) {

        //read request parameter from the form
        String name = request.getParameter("studentName");

        //convert data to uppercase
        name = name.toLowerCase();

        //create the message
        String result = "Hello, " + name + "!";

        //add message to model
        model.addAttribute("message", result);

        return "helloworld";
    }

    @PostMapping("/processFormV3")
    //need a controller method to read form data, and then add data to the model.
    public String letsShoutDude(@RequestParam String studentName, Model model) {

        //convert data to uppercase
        studentName = studentName.toLowerCase();

        //create the message
        String result = "Hello, " + studentName + "!";

        //add message to model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
