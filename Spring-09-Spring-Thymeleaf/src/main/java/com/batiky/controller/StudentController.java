package com.batiky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/register")
public String register(){
    return "student/register";
}

@RequestMapping("/welcome")
    public String info(){
        return "student/welcome";
}
}
