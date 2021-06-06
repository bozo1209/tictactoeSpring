package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//    @GetMapping(value = {"/", "/home"})
//    public static ModelAndView homePage(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("/sites/index.html");
//        return modelAndView;
////        return "/sites/index";
//    }
    @GetMapping(value = {"/", "/home"})
//    @RequestMapping(value = {"/", "/home"})
    public static String homePage(){
        System.out.println("*********");
        return "index";
    }

    @RequestMapping(value = "/cos")
    public static String test(){
        System.out.println("********* cos ****************");
        return "cos";
    }
}
