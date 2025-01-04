package com.nirmalyam.collection.controller;

import com.nirmalyam.collection.model.Registration;
import com.nirmalyam.collection.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private RegistrationRepository repository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("registration", new Registration());
        return "index";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute Registration registration, Model model) {
        repository.save(registration);
        model.addAttribute("message", "Registration successful!");
        return "index";
    }
}
