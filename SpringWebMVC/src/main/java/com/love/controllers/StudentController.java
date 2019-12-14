package com.love.controllers;

import com.love.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController
{
    @RequestMapping("/showForm")
    public String showForm(Model theModel)
    {
        Student theStudent = new Student();
        theModel.addAttribute("student",theStudent);
        return "student-form";
    }
    @RequestMapping("/processFrom")
    public String processForm(@ModelAttribute("student")Student theStudent)
    {
        System.out.println(theStudent.getFirstName());
        System.out.println(theStudent.getLastName());
        return "student-confirmation";
    }

}
