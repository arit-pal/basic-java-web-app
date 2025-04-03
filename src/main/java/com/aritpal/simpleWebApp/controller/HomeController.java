package com.aritpal.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet() {
        return "Hello, welcome to my website!";
    }
    @RequestMapping("/about")
    public String about() {
        return "My name is Arit Pal and I am learning Java backend development!";
    }
}
