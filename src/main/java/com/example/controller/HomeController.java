package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class HomeController {

    private String[][] list;

//    @GetMapping(value = {"/", "/home"})
//    public static ModelAndView homePage(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("/sites/index.html");
//        return modelAndView;
////        return "/sites/index";
//    }
    @GetMapping(value = {"/", "/home"})
//    @RequestMapping(value = {"/", "/home"})
    public String homePage(Model model){
        System.out.println("*********");
        list = new String[3][3];
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list[i][j] = " ";
            }
        }
        model.addAttribute("list", list);
        return "index";
    }

    @PostMapping(value = {"/", "/home"})
    public String game(@RequestParam("button") String buttonValue, Model model){
        System.out.println("**** post *****");
        if (buttonValue.equals("newGameButton")){
            System.out.println("new game pressed");
            for (int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    list[i][j] = " ";
                }
            }
        }else {
            System.out.println("game button pressed: ");
            System.out.println(buttonValue);
//            model.addAttribute(buttonValue, )
            if (buttonValue.equals("button00")){
                if (list[0][0].equals(" ")){
                    list[0][0] = "x";
                }
            }else if (buttonValue.equals("button01")){
                if (list[0][1].equals(" ")){
                    list[0][1] = "x";
                }
            }else if (buttonValue.equals("button02")){
                if (list[0][2].equals(" ")){
                    list[0][2] = "x";
                }
            }else if (buttonValue.equals("button10")){
                if (list[1][0].equals(" ")){
                    list[1][0] = "o";
                }
            }else if (buttonValue.equals("button11")){
                if (list[1][1].equals(" ")){
                    list[1][1] = "o";
                }
            }else if (buttonValue.equals("button12")){
                if (list[1][2].equals(" ")){
                    list[1][2] = "o";
                }
            }else if (buttonValue.equals("button20")){
                if (list[2][0].equals(" ")){
                    list[2][0] = "x";
                }
            }else if (buttonValue.equals("button21")){
                if (list[2][1].equals(" ")){
                    list[2][1] = "x";
                }
            }else if (buttonValue.equals("button22")){
                if (list[2][2].equals(" ")){
                    list[2][2] = "x";
                }
            }
        }
        model.addAttribute("list", list);
        System.out.println("-------------------");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("|" + list[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------------------");
//        System.out.println(list.length);
        return "index";
    }

    @RequestMapping(value = "/cos")
    public static String test(){
        System.out.println("********* cos ****************");
        return "cos";
    }
}
