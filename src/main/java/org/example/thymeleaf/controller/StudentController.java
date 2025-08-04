package org.example.thymeleaf.controller;

import org.example.thymeleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/showStudentForm")
    public String showForm(Model model) {
        //crate a new Student object
        Student student = new Student();
        //add student object to model
        model.addAttribute("student", student);
        return "student-form";
    }
}
