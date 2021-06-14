package com.example.controller;

import com.example.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private final GameService gameService;

    @Autowired
    public HomeController(GameService gameService){
        this.gameService = gameService;
    }

    @GetMapping(value = {"/", "/home"})
    public String homePage(Model model){
        gameService.homePage(model);
        return "index";
    }

    @PostMapping(value = {"/", "/home"})
    public String game(@RequestParam("button") String buttonValue, Model model){
        if (buttonValue.equals("newGameButton")){
            gameService.homePage(model);
        }else {
            gameService.game(buttonValue, model);
        }
        return "index";
    }
}
