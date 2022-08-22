package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {
    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
        int a = Integer.parseInt(request.getParameter("p1"));
        int b = Integer.parseInt(request.getParameter("p2"));
        int c=a+b;
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        mv.addObject("result",c);
//        System.out.println("hello");
        return mv;
    }
}
