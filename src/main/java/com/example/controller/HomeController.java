package com.example.controller;

import com.example.game.gameBoard.GameBoard;
import com.example.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private GameService gameService;
//    private String[][] list;
//    private boolean player1;
//    private GameBoard gameBoard;

    @Autowired
    public HomeController(GameService gameService){
        this.gameService = gameService;
    }

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
        System.out.println("***** get ****");
//        list = new String[3][3];
//        for (int i = 0; i < 3; i++){
//            for(int j = 0; j < 3; j++){
//                list[i][j] = " ";
//            }
//        }
//        player1 = true;
//        String[][] gameBoardList = gameBoard.getGameBoard();
//        model.addAttribute("list", list);
//        model.addAttribute("list", gameBoardList);
//        model.addAttribute("list", gameBoard.getGameBoard());
//        gameBoard.getGameBoard();
        gameService.homePage(model);
        return "index";
    }

    @PostMapping(value = {"/", "/home"})
    public String game(@RequestParam("button") String buttonValue, Model model){
        System.out.println("**** post *****");
        if (buttonValue.equals("newGameButton")){
            System.out.println("new game pressed");
//            for (int i = 0; i < 3; i++){
//                for(int j = 0; j < 3; j++){
//                    list[i][j] = " ";
//                }
//            }
//            player1 = true;
//            gameBoard.setGameBoardToNull();
//            gameBoard.getGameBoard();
            gameService.homePage(model);
        }else {
            System.out.println("game button pressed: ");
            System.out.println(buttonValue);
//            model.addAttribute(buttonValue, )
//            if (buttonValue.equals("button00")){
//                if (list[0][0].equals(" ")){
//                    if (player1){
//                        gameBoard.addMoveToBoard(0,0,"x");
//                        list[0][0] = "x";
//                        player1 = false;
//                    }else {
//                        gameBoard.addMoveToBoard(0,0,"o");
//                        list[0][0] = "o";
//                        player1 = true;
//                    }
////                    list[0][0] = "x";
//                }
//            }else if (buttonValue.equals("button01")){
//                if (list[0][1].equals(" ")){
//                    if (player1){
//                        gameBoard.addMoveToBoard(0,1,"x");
//                        list[0][1] = "x";
//                        player1 = false;
//                    }else {
//                        gameBoard.addMoveToBoard(0,1,"o");
//                        list[0][1] = "o";
//                        player1 = true;
//                    }
////                    list[0][1] = "x";
//                }
//            }else if (buttonValue.equals("button02")){
//                if (list[0][2].equals(" ")){
//                    if (player1){
//                        gameBoard.addMoveToBoard(0,2,"x");
//                        list[0][2] = "x";
//                        player1 = false;
//                    }else {
//                        gameBoard.addMoveToBoard(0,2,"o");
//                        list[0][2] = "o";
//                        player1 = true;
//                    }
////                    list[0][2] = "x";
//                }
//            }else if (buttonValue.equals("button10")){
//                if (list[1][0].equals(" ")){
//                    if (player1){
//                        gameBoard.addMoveToBoard(1,0,"x");
//                        list[1][0] = "x";
//                        player1 = false;
//                    }else {
//                        gameBoard.addMoveToBoard(1,0,"o");
//                        list[1][0] = "o";
//                        player1 = true;
//                    }
////                    list[1][0] = "o";
//                }
//            }else if (buttonValue.equals("button11")){
//                if (list[1][1].equals(" ")){
//                    if (player1){
//                        gameBoard.addMoveToBoard(1,1,"x");
//                        list[1][1] = "x";
//                        player1 = false;
//                    }else {
//                        gameBoard.addMoveToBoard(1,1,"o");
//                        list[1][1] = "o";
//                        player1 = true;
//                    }
////                    list[1][1] = "o";
//                }
//            }else if (buttonValue.equals("button12")){
//                if (list[1][2].equals(" ")){
//                    if (player1){
//                        gameBoard.addMoveToBoard(1,2,"x");
//                        list[1][2] = "x";
//                        player1 = false;
//                    }else {
//                        gameBoard.addMoveToBoard(1,2,"o");
//                        list[1][2] = "o";
//                        player1 = true;
//                    }
////                    list[1][2] = "o";
//                }
//            }else if (buttonValue.equals("button20")){
//                if (list[2][0].equals(" ")){
//                    if (player1){
//                        gameBoard.addMoveToBoard(2,0,"x");
//                        list[2][0] = "x";
//                        player1 = false;
//                    }else {
//                        gameBoard.addMoveToBoard(2,0,"o");
//                        list[2][0] = "o";
//                        player1 = true;
//                    }
////                    list[2][0] = "x";
//                }
//            }else if (buttonValue.equals("button21")){
//                if (list[2][1].equals(" ")){
//                    if (player1){
//                        gameBoard.addMoveToBoard(2,1,"x");
//                        list[2][1] = "x";
//                        player1 = false;
//                    }else {
//                        gameBoard.addMoveToBoard(2,1,"o");
//                        list[2][1] = "o";
//                        player1 = true;
//                    }
////                    list[2][1] = "x";
//                }
//            }else if (buttonValue.equals("button22")){
//                if (list[2][2].equals(" ")){
//                    if (player1){
//                        gameBoard.addMoveToBoard(2,2,"x");
//                        list[2][2] = "x";
//                        player1 = false;
//                    }else {
//                        gameBoard.addMoveToBoard(2,2,"o");
//                        list[2][2] = "o";
//                        player1 = true;
//                    }
////                    list[2][2] = "x";
//                }
//            }
            gameService.game(buttonValue);
        }
//        model.addAttribute("list", list);
//        model.addAttribute("list", gameBoard.getGameBoard());
//        System.out.println("-------------------");
//        for (int i = 0; i < 3; i++){
//            for (int j = 0; j < 3; j++){
//                System.out.print("|" + list[i][j] + "|");
//            }
//            System.out.println();
//        }
//        System.out.println("-------------------");
//        System.out.println(list.length);
//        gameBoard.printGameBoard();
//        gameBoard.resultsOfGame();
//        System.out.println("results: " + gameBoard.resultsOfGame());
        gameService.gameMoveSend(model);
        return "index";
    }

    @RequestMapping(value = "/cos")
    public static String test(){
        System.out.println("********* cos ****************");
        return "cos";
    }
}
