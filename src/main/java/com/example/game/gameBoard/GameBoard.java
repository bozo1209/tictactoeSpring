package com.example.game.gameBoard;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class GameBoard {

    private String[][] gameBoard;

    public void createGameBoard(){
        gameBoard = new String[3][3];
        for (String[] strings : gameBoard) {
            Arrays.fill(strings, " ");
        }
    }

    public String[][] getGameBoard() {
        if (gameBoard == null){
            createGameBoard();
        }
        return gameBoard;
    }

    public void setGameBoardToNull(){
        gameBoard = null;
    }

    public void addMoveToBoard(int i, int j, String mark){
        gameBoard[i][j] = mark;
    }

    @SuppressWarnings("ForLoopReplaceableByForEach")
    public GameStatus resultsOfGame(){
        for (int i = 0; i < gameBoard.length; i++){
            for (int j = 0; j < gameBoard[i].length; j++){
                if (gameBoard[i][0].equals("x") && gameBoard[i][1].equals("x") && gameBoard[i][2].equals("x")){
                    return GameStatus.PLAYER1WIN;
                }else if (gameBoard[0][j].equals("x") && gameBoard[1][j].equals("x") && gameBoard[2][j].equals("x")){
                    return GameStatus.PLAYER1WIN;
                }else if (gameBoard[0][0].equals("x") && gameBoard[1][1].equals("x") && gameBoard[2][2].equals("x")){
                    return GameStatus.PLAYER1WIN;
                }else if (gameBoard[2][0].equals("x") && gameBoard[1][1].equals("x") && gameBoard[0][2].equals("x")){
                    return GameStatus.PLAYER1WIN;
                }else if (gameBoard[i][0].equals("o") && gameBoard[i][1].equals("o") && gameBoard[i][2].equals("o")){
                    return GameStatus.PLAYER2WIN;
                }else if (gameBoard[0][j].equals("o") && gameBoard[1][j].equals("o") && gameBoard[2][j].equals("o")){
                    return GameStatus.PLAYER2WIN;
                }else if (gameBoard[0][0].equals("o") && gameBoard[1][1].equals("o") && gameBoard[2][2].equals("o")){
                    return GameStatus.PLAYER2WIN;
                }else if (gameBoard[2][0].equals("o") && gameBoard[1][1].equals("o") && gameBoard[0][2].equals("o")){
                    return GameStatus.PLAYER2WIN;
                }
            }
        }

        if (!this.arrayHasEmptyElement(gameBoard)){
            return GameStatus.TIE;
        }
        return GameStatus.ONGOING;
    }

    private boolean arrayHasEmptyElement(String[][] array){
        for (String[] arrayElement : array){
            for (String element : arrayElement){
                if (element.equals(" ")){
                    return true;
                }
            }
        }
        return false;
    }

    public void printGameBoard(){
        System.out.println("-------------------");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("|" + gameBoard[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }
}
