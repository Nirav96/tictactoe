package com.nirav.tictactoe;

class Player{
    private String name;
    private char symbole;

    public Player(String name, char symbole) {
        this.name = name;
        this.symbole = symbole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbole() {
        return symbole;
    }

    public void setSymbole(char symbole) {
        this.symbole = symbole;
    }
}