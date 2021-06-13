package com.example.service;

import com.example.game.ai.CustomPair;
import com.example.game.ai.TicTacToeAI;
import com.example.game.gameBoard.GameBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class GameService {

    private GameBoard gameBoard;
    private boolean player1;

    @Autowired
    public GameService(GameBoard gameBoard){
        this.gameBoard = gameBoard;
    }

    public void homePage(Model model){
        player1 = true;
        gameBoard.setGameBoardToNull();
//        model.addAttribute("list", gameBoard.getGameBoard());
//        gameResults(model);
        gameMoveSend(model);
    }

    public void game(String buttonValue, Model model){
        gamePlaying(buttonValue);
        gameMoveSend(model);
    }

    private void gamePlaying(String buttonValue){
        String[][] gameBoardMoveList = gameBoard.getGameBoard();
        if (buttonValue.equals("button00")){
            if (gameBoardMoveList[0][0].equals(" ")){
                if (player1){
                    gameBoard.addMoveToBoard(0,0,"x");
//                    list[0][0] = "x";
//                    player1 = false;
//                    TicTacToeAI.bestMove(gameBoard);
                }else {
                    gameBoard.addMoveToBoard(0,0,"o");
//                    list[0][0] = "o";
                    player1 = true;
                }
//                    list[0][0] = "x";
            }
        }else if (buttonValue.equals("button01")){
            if (gameBoardMoveList[0][1].equals(" ")){
                if (player1){
                    gameBoard.addMoveToBoard(0,1,"x");
//                    list[0][1] = "x";
//                    player1 = false;
//                    TicTacToeAI.bestMove(gameBoard);
                }else {
                    gameBoard.addMoveToBoard(0,1,"o");
//                    list[0][1] = "o";
                    player1 = true;
                }
//                    list[0][1] = "x";
            }
        }else if (buttonValue.equals("button02")){
            if (gameBoardMoveList[0][2].equals(" ")){
                if (player1){
                    gameBoard.addMoveToBoard(0,2,"x");
//                    list[0][2] = "x";
//                    player1 = false;
//                    TicTacToeAI.bestMove(gameBoard);
                }else {
                    gameBoard.addMoveToBoard(0,2,"o");
//                    list[0][2] = "o";
                    player1 = true;
                }
//                    list[0][2] = "x";
            }
        }else if (buttonValue.equals("button10")){
            if (gameBoardMoveList[1][0].equals(" ")){
                if (player1){
                    gameBoard.addMoveToBoard(1,0,"x");
//                    list[1][0] = "x";
//                    player1 = false;
//                    TicTacToeAI.bestMove(gameBoard);
                }else {
                    gameBoard.addMoveToBoard(1,0,"o");
//                    list[1][0] = "o";
                    player1 = true;
                }
//                    list[1][0] = "o";
            }
        }else if (buttonValue.equals("button11")){
            if (gameBoardMoveList[1][1].equals(" ")){
                if (player1){
                    gameBoard.addMoveToBoard(1,1,"x");
//                    list[1][1] = "x";
//                    player1 = false;
//                    TicTacToeAI.bestMove(gameBoard);
                }else {
                    gameBoard.addMoveToBoard(1,1,"o");
//                    list[1][1] = "o";
                    player1 = true;
                }
//                    list[1][1] = "o";
            }
        }else if (buttonValue.equals("button12")){
            if (gameBoardMoveList[1][2].equals(" ")){
                if (player1){
                    gameBoard.addMoveToBoard(1,2,"x");
//                    list[1][2] = "x";
//                    player1 = false;
//                    TicTacToeAI.bestMove(gameBoard);
                }else {
                    gameBoard.addMoveToBoard(1,2,"o");
//                    list[1][2] = "o";
                    player1 = true;
                }
//                    list[1][2] = "o";
            }
        }else if (buttonValue.equals("button20")){
            if (gameBoardMoveList[2][0].equals(" ")){
                if (player1){
                    gameBoard.addMoveToBoard(2,0,"x");
//                    list[2][0] = "x";
//                    player1 = false;
//                    TicTacToeAI.bestMove(gameBoard);
                }else {
                    gameBoard.addMoveToBoard(2,0,"o");
//                    list[2][0] = "o";
                    player1 = true;
                }
//                    list[2][0] = "x";
            }
        }else if (buttonValue.equals("button21")){
            if (gameBoardMoveList[2][1].equals(" ")){
                if (player1){
                    gameBoard.addMoveToBoard(2,1,"x");
//                    list[2][1] = "x";
//                    player1 = false;
//                    TicTacToeAI.bestMove(gameBoard);
                }else {
                    gameBoard.addMoveToBoard(2,1,"o");
//                    list[2][1] = "o";
                    player1 = true;
                }
//                    list[2][1] = "x";
            }
        }else if (buttonValue.equals("button22")){
            if (gameBoardMoveList[2][2].equals(" ")){
                if (player1){
                    gameBoard.addMoveToBoard(2,2,"x");
//                    list[2][2] = "x";
//                    player1 = false;
//                    TicTacToeAI.bestMove(gameBoard);
                }else {
                    gameBoard.addMoveToBoard(2,2,"o");
//                    list[2][2] = "o";
                    player1 = true;
                }
//                    list[2][2] = "x";
            }
        }
        CustomPair customPair = TicTacToeAI.bestMove(gameBoard);
        gameBoard.addMoveToBoard(customPair.getRow(), customPair.getColumn(), "o");
    }

    private void gameMoveSend(Model model){
        model.addAttribute("list", gameBoard.getGameBoard());
        gameBoard.printGameBoard();
        gameResults(model);
    }

    private void gameResults(Model model){
        System.out.println("results: " + gameBoard.resultsOfGame());
        model.addAttribute("results", gameBoard.resultsOfGame());
    }
}
