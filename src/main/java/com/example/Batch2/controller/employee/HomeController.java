package com.example.Batch2.controller.employee;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class HomeController {
    @RequestMapping("")
    public String home(){
        return "home";
    }
    @RequestMapping("/home")
    public String homee(){
        return "home";
    }
}
