package com.batiky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller// Annotate the class with the @Controller stereotipe annotation
public class HomeController {

@RequestMapping("/home") // Use @RequestMapping annotation to assocoate the acytion with Http request path
    public String home(){
    return "home.html"; // return th HTML document name that contains the details we want the browser to display
}

    @RequestMapping("/welcome")
    public String home2(){
        return "welcome.html";
    }


    @RequestMapping
    public String home3(){
        return "welcome.html";
    }
}
