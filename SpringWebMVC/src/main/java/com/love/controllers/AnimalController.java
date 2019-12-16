package com.love.controllers;

import com.love.entity.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/animal")
public class AnimalController {

    @RequestMapping("/showAnimal")
    public String tigerForm(Model tigerModel)
    {
        Animal tiger = new Animal();
        tigerModel.addAttribute("tiger",tiger);
        return "tiger-form";
    }

    @RequestMapping("/tiger")
    public String tiger(@ModelAttribute("tiger")Animal tiger){
        return "tiger";
    }

}
