package com.love.controllers;

import com.love.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController
{
    @Value("#{countryOptions}")
    private Map<String,String> countryOptions;

    @RequestMapping("/showForm")
    public String showForm(Model theModel)
    {
        Student theStudent = new Student();
        theModel.addAttribute("student",theStudent);
        theModel.addAttribute("theCountryOptions",countryOptions);
        return "student-form";
    }
    @RequestMapping("/processFrom")
    public String processForm(@Valid @ModelAttribute("student")Student theStudent, BindingResult result)
    {
        if(result.hasErrors())
        {
            return "student-form";
        }
        return "student-confirmation";
    }

}
