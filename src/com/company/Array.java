package com.company;

import java.util.Arrays;

public class Array extends Calculator{
    private int x, y;
    private char[] massiv;
    private char z;
    protected int i=0;

    void Array(char[] array){
        massiv=array;
        x = Character.getNumericValue(massiv[0]);
        z = massiv[1];
        y = Character.getNumericValue(massiv[2]);

        Math(x,z,y);
    }

    void Math(int a, char b, int c){
        switch (b) {
            case '+':
                System.out.println(a+c);
                break;
            case '-':
                System.out.println(a-c);
                break;
            case '*':
                System.out.println(a*c);
                break;
            case '/':
                if (c==0)
                    System.err.print("You cannot divide into 0");
                else
                    System.out.println(a/c);
                break;
            default:
                System.out.println("Input error!!! Try again;)");
        }
    }
}
