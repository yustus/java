package com.company;

public abstract class Shape{
    private char symbol ;

    public Shape() {

    }

    public char getSymbol() {
        return symbol;
    }


    public void setSymbol(char symbol) {

        this.symbol = symbol;
    }

    public abstract void draw();
    public abstract void draw2();

    public Shape(char symbol) {
        this.symbol = symbol;
    }
}
