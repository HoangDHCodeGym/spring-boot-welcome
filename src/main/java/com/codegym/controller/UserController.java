package com.codegym.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Value("Welcome!")
    private String message = "Welcome";

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("message", this.message);
        return "welcome";
    }

}
