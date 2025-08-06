package org.example.thymeleaf.controller;

import org.example.thymeleaf.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}") //spring core syntax
    private List<String> coutnires; //load .properties to the field

    @GetMapping("/showStudentForm")
    public String showForm(Model model) {
        //crate a new Student object
        Student student = new Student();
        //add student object to model
        model.addAttribute("student", student);
        //add countries list to model
        model.addAttribute("countries", coutnires);
        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student student) {
        System.out.println("student: " + student);
//        return "student-confirmation";
        return "student-confirmation";
    }

}
