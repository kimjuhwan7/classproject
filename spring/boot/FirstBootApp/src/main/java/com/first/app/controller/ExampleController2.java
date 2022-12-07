package com.first.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/ex")
public class ExampleController2 {

    @GetMapping("/ex1_1")
    public String ex1(Model model) {


        model.addAttribute("localDateTiem", LocalDateTime.now());

        model.addAttribute("data", "DATA123");
        model.addAttribute("nullData", null);

        return "ex/ex1_1";
    }
}
