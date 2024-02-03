package com.nirav.tictactoe.exceptions;

public class InvalidBoardSizeException extends Exception{
    
    public InvalidBoardSizeException(String messageString){
        super(messageString);
    }

}
