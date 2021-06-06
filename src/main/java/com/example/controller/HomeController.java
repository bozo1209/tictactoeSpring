package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @PostMapping(value = {"/", "/home"})
    public static String game(@RequestParam("button") String buttonValue){
        System.out.println("**** post *****");
        if (buttonValue.equals("newGameButton")){
            System.out.println("new game pressed");
        }else {
            System.out.println("game button pressed");
        }
        return "index";
    }

    @RequestMapping(value = "/cos")
    public static String test(){
        System.out.println("********* cos ****************");
        return "cos";
    }
}
