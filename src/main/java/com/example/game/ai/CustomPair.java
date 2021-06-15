package com.example.game.ai;

/**
 * custom pair, store next move for ai player
 */
public class CustomPair {

    private final int row;
    private final int column;

    CustomPair(int row, int column){
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
