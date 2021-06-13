package com.example.game.ai;

import com.example.game.gameBoard.GameBoard;
import com.example.game.gameBoard.GameStatus;

public class TicTacToeAI {

    public static CustomPair bestMove(GameBoard gameBoard){
        CustomPair move = null;
        int bestScore = Integer.MAX_VALUE;

        for (int i = 0; i < gameBoard.getGameBoard().length; i++){
            for (int j = 0; j < gameBoard.getGameBoard()[i].length; j++){
                if (gameBoard.getGameBoard()[i][j].equals(" ")){
                    gameBoard.addMoveToBoard(i, j, "o");
                    int score = minimax(gameBoard, 0, true, Integer.MIN_VALUE, Integer.MAX_VALUE);
                    gameBoard.addMoveToBoard(i, j, " ");
                    if (score < bestScore){
                        bestScore = score;
                        move = new CustomPair(i, j);
                    }
                }
            }
        }
        return move;
    }

    private static int minimax(GameBoard gameBoard, int depth, boolean isMaximizing, int alpha, int beta){
        if (!gameBoard.resultsOfGame().equals(GameStatus.ONGOING)){
            return switch (gameBoard.resultsOfGame()){
                case PLAYER1WIN -> 10;
                case PLAYER2WIN -> -10;
                case TIE -> 0;
                default -> throw new IllegalStateException("Unexpected value: " + gameBoard.resultsOfGame());
            };
        }
        int bestScore;

        if (isMaximizing){
            bestScore = Integer.MIN_VALUE;
            outerLoop:
            for (int i = 0; i < gameBoard.getGameBoard().length; i++){
                for (int j = 0; j < gameBoard.getGameBoard()[i].length; j++){
                    if (gameBoard.getGameBoard()[i][j].equals(" ")){
                        gameBoard.addMoveToBoard(i, j, "x");
                        int score = minimax(gameBoard, depth + 1, false, alpha, beta);
                        score -= depth;
                        gameBoard.addMoveToBoard(i, j, " ");
                        bestScore = Math.max(score, bestScore);
                        alpha = Math.max(alpha, bestScore);
                        if (beta <= alpha){
                            break outerLoop;
                        }
                    }
                }
            }
        }else {
            bestScore = Integer.MAX_VALUE;
            outerLoop:
            for (int i = 0; i < gameBoard.getGameBoard().length; i++){
                for (int j = 0; j < gameBoard.getGameBoard()[i].length; j++){
                    if (gameBoard.getGameBoard()[i][j].equals(" ")){
                        gameBoard.addMoveToBoard(i, j, "o");
                        int score = minimax(gameBoard, depth + 1, true, alpha, beta);
                        score += depth;
                        gameBoard.addMoveToBoard(i, j, " ");
                        bestScore = Math.min(score, bestScore);
                        alpha = Math.min(alpha, bestScore);
                        if (beta <= alpha){
                            break outerLoop;
                        }
                    }
                }
            }
        }

        return bestScore;
    }
}
