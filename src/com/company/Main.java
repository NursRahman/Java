package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if(s!=null && s.length()==0) System.out.println("String is empty");

        Calculator ou = new Calculator();
        ou.Calculator(s);
    }
}
