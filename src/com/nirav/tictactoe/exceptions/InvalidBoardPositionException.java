package com.nirav.tictactoe.exceptions;

public class InvalidBoardPositionException extends Exception{
    public InvalidBoardPositionException(String messageString){
        super(messageString);
    }
}
