package ru.web.mvc_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DiaryController {
    @GetMapping("/diary")
    public String diaryPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            @RequestParam(value = "age", required = false) int age,
                            Model model) {
        model.addAttribute("message", "Hello " + name + " " + surname + ", my name is Tom Riddle");
        model.addAttribute("your_age", "Your age is " + age);
        return "diary/hello";
    }
}


