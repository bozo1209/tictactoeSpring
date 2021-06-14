package com.example.service;

import com.example.game.ai.CustomPair;
import com.example.game.ai.TicTacToeAI;
import com.example.game.gameBoard.GameBoard;
import com.example.game.gameBoard.GameStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class GameService {

    private final GameBoard gameBoard;

    @Autowired
    public GameService(GameBoard gameBoard){
        this.gameBoard = gameBoard;
    }

    public void homePage(Model model){
        gameBoard.setGameBoardToNull();
        gameMoveSend(model);
    }

    public void game(String buttonValue, Model model){
        if (gameBoard.resultsOfGame().equals(GameStatus.ONGOING)){
            gamePlaying(buttonValue);
        }
        gameMoveSend(model);
    }

    private void gamePlaying(String buttonValue){
        String[][] gameBoardMoveList = gameBoard.getGameBoard();
        switch (buttonValue) {
            case "button00":
                if (gameBoardMoveList[0][0].equals(" ")) {
                    gameBoard.addMoveToBoard(0, 0, "x");
                    aiMove();
                }
                break;
            case "button01":
                if (gameBoardMoveList[0][1].equals(" ")) {
                    gameBoard.addMoveToBoard(0, 1, "x");
                    aiMove();
                }
                break;
            case "button02":
                if (gameBoardMoveList[0][2].equals(" ")) {
                    gameBoard.addMoveToBoard(0, 2, "x");
                    aiMove();
                }
                break;
            case "button10":
                if (gameBoardMoveList[1][0].equals(" ")) {
                    gameBoard.addMoveToBoard(1, 0, "x");
                    aiMove();
                }
                break;
            case "button11":
                if (gameBoardMoveList[1][1].equals(" ")) {
                    gameBoard.addMoveToBoard(1, 1, "x");
                    aiMove();
                }
                break;
            case "button12":
                if (gameBoardMoveList[1][2].equals(" ")) {
                    gameBoard.addMoveToBoard(1, 2, "x");
                    aiMove();
                }
                break;
            case "button20":
                if (gameBoardMoveList[2][0].equals(" ")) {
                    gameBoard.addMoveToBoard(2, 0, "x");
                    aiMove();
                }
                break;
            case "button21":
                if (gameBoardMoveList[2][1].equals(" ")) {
                    gameBoard.addMoveToBoard(2, 1, "x");
                    aiMove();
                }
                break;
            case "button22":
                if (gameBoardMoveList[2][2].equals(" ")) {
                    gameBoard.addMoveToBoard(2, 2, "x");
                    aiMove();
                }
                break;
        }
    }

    private void aiMove(){
        if (gameBoard.resultsOfGame().equals(GameStatus.ONGOING)) {
            CustomPair customPair = TicTacToeAI.bestMove(gameBoard);
            gameBoard.addMoveToBoard(customPair.getRow(), customPair.getColumn(), "o");
        }
    }

    private void gameMoveSend(Model model){
        model.addAttribute("list", gameBoard.getGameBoard());
        gameBoard.printGameBoard();
        gameResults(model);
    }

    private void gameResults(Model model){
        model.addAttribute("results", gameBoard.resultsOfGame());
    }
}
