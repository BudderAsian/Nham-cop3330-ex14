package com.example;

import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Richard Nham
 */

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String wi = "WI";
        double amount = 0.0;
        double tax = 0.0;
        String state;
        Scanner scannerUserInput= new Scanner(System.in);

        System.out.print("What is the order amount?");
        amount =  scannerUserInput.nextDouble();
        tax = 0.055*amount;

        System.out.print("What is the state?");
        state =  scannerUserInput.next();

        scannerUserInput.close();

        if(wi.compareTo(state) == 0) {
            System.out.println("The subtotal is " + roundNumber(amount));
            System.out.println("The tax is " + roundNumber(tax));
            System.out.println("The total is " + roundNumber(amount+tax));
            return ;
        }

        System.out.println("The total is " + roundNumber(amount));



    }

    public static double roundNumber(double value) {
        return (double)Math.round(value * 100d) / 100d;
    }

}
