package com.batiky.controller;

import com.batiky.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model) {

        model.addAttribute("name", "Batiky");
        model.addAttribute("course", "MVC");

        String subject = "Collections";
        model.addAttribute("subject", subject);

        //cretae some student id and show it on UI
        int studentId = new Random().nextInt();
        model.addAttribute("id", studentId);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);
        numbers.add(8);
        model.addAttribute("numbers", numbers);

        Student student = new Student(1,"Mike", "Hunt");
        model.addAttribute("student", student);


        return "student/welcome";
    }

}
