package com.example.game.gameBoard;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GameBoardTest {

    GameBoard gameBoard;

    @BeforeAll
    void setUp(){
        gameBoard = new GameBoard();
    }

    @Test
    void resultsOfGameTest1() {
        gameBoard.getGameBoard();
        gameBoard.addMoveToBoard(2,0,"x");
        gameBoard.addMoveToBoard(1,1,"x");
        gameBoard.addMoveToBoard(0,2,"x");
        assertEquals(GameStatus.PLAYER1WIN, gameBoard.resultsOfGame());
        gameBoard.setGameBoardToNull();
    }

    @Test
    void resultsOfGameTest2() {
        gameBoard.getGameBoard();
        gameBoard.addMoveToBoard(0,2,"o");
        gameBoard.addMoveToBoard(1,2,"o");
        gameBoard.addMoveToBoard(2,2,"o");
        assertEquals(GameStatus.PLAYER2WIN, gameBoard.resultsOfGame());
        gameBoard.setGameBoardToNull();
    }

    @Test
    void resultsOfGameTest3() {
        gameBoard.getGameBoard();
        gameBoard.addMoveToBoard(0,0,"x");
        gameBoard.addMoveToBoard(0,1,"o");
        gameBoard.addMoveToBoard(0,2,"x");
        gameBoard.addMoveToBoard(1,0,"o");
        gameBoard.addMoveToBoard(1,1,"o");
        gameBoard.addMoveToBoard(1,2,"x");
        gameBoard.addMoveToBoard(2,0,"x");
        gameBoard.addMoveToBoard(2,1,"x");
        gameBoard.addMoveToBoard(2,2,"o");
        assertEquals(GameStatus.TIE, gameBoard.resultsOfGame());
        gameBoard.setGameBoardToNull();
    }

    @Test
    void resultsOfGameTest4() {
        gameBoard.getGameBoard();
        gameBoard.addMoveToBoard(0,2,"x");
        gameBoard.addMoveToBoard(1,2,"o");
        gameBoard.addMoveToBoard(2,2,"x");
        assertEquals(GameStatus.ONGOING, gameBoard.resultsOfGame());
        gameBoard.setGameBoardToNull();
    }
}