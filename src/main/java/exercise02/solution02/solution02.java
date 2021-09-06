/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Paez
 */

package exercise02.solution02;
import java.util.Scanner;

public class solution02{
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the input string?");

        String inputString = myObj.nextLine();
        int characterLength = 0;
        characterLength = inputString.length();
        myObj.close();

        System.out.println(inputString + " has " + characterLength + " characters." );
    }
}
