package com.nirav.tictactoe;

import java.util.Arrays;

import com.nirav.tictactoe.exceptions.InvalidBoardPositionException;
import com.nirav.tictactoe.exceptions.InvalidBoardSizeException;

public class Board {
    private static final int MIN_BOARD_SIZE = 3;
    private char DEFAULT_CELL_VALUE = '.';
    private int size;
    private char[][] board;

    public Board(int size) throws InvalidBoardSizeException {
        if(size < MIN_BOARD_SIZE) throw new InvalidBoardSizeException("Minimum Board Size is " + MIN_BOARD_SIZE);
        this.size = size;
        board = new char[this.size][this.size];

        for(char[] row : this.board) Arrays.fill(row, DEFAULT_CELL_VALUE);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }
    
    public void putSymbole(int row, int col, char symbole) throws InvalidBoardPositionException{
        if(!isValidPositionToAddSymbole(row, col)){
            throw new InvalidBoardPositionException("Invalid board position selected");
        }

        this.board[row][col] = symbole;
    }

    public char getSymbole(int row, int col, char symbole) throws InvalidBoardPositionException{
        if(!isValidPosition(row, col)){
            throw new InvalidBoardPositionException("Invalid board position selected");
        }

        return this.board[row][col];
    }

    

    private boolean isValidPosition(int row, int col){
        return !(row < 0 || col < 0 || row >= this.size || col >= this.size);
    }

    private boolean isValidPositionToAddSymbole(int row, int col){
        return isValidPosition(row, col) && this.board[row][col] != DEFAULT_CELL_VALUE;
    }
}
