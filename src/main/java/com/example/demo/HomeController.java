package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")    // the root will go to index
    public String homePage(){
        return "index";
    }

    @RequestMapping("/registration") // so that the browser may recognize it
    public String registration(){
        return "registration";
    }
}
