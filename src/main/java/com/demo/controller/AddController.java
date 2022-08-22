package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddController {
    @RequestMapping("/add")
    public String add(){
        System.out.println("hello");
        return "index";
    }
}
