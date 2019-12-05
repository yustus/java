package com.company;

public class Rechtangle extends  Shape implements Rechtangle2 {

    private int width;
    private int height;
    private char symbol2;

    public Rechtangle(char symbol,int width, int height) {
        super(symbol);
        this.width = width;
        this.height = height;
    }


    public Rechtangle(char symbol, int width, int height, char symbol2) {
        super(symbol);
        this.symbol2 = symbol2;
        this.width = width;
        this.height = height;

    }

    @Override
    public void draw() {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                System.out.print(getSymbol() + " ");
            }

            System.out.println();
        }
    }


    public void  draw2() {

        char[][] array = new char[height][width];


        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width ; j++) {
              //  array[i][j] = getSymbol();


                //array[1][1] = symbol2;
                array[0][j] = getSymbol();

                array[1][2] = symbol2;




            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {


                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }

}



