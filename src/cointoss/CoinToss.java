/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cointoss;

import java.util.Random;
import java.util.Scanner;

/**
 * Chapter 4 Exercise 10
 *
 * Write a program that will compute the statistics for 8 coin tosses.
 *
 * The program will then display: a) total number of heads and tails b)
 * percentage of heads and tails
 *
 * Example: Toss 1: heads Toss 2: tails Toss 3: tails
 *
 * Number of heads: 1 Number of tails: 2
 *
 * Percent heads: 33.3% Percent tails: 66.6%
 *
 * @author skiroc
 */
public class CoinToss {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instance variables
        Scanner kb = new Scanner(System.in);
        Random coinToss = new Random();
        int numberOfTosses;
        int tossNumber = 0;
        int numberOfHeads = 0;
        int numberOfTails = 0;
        int max = 1;
        double percentHeads, percentTails;
        
        // Prompting the user to enter a number to determine how many times
        // the coin will be flipped
        System.out.println("Enter a number to determine how many times the coin is flipped:");
        numberOfTosses = kb.nextInt();

        while (numberOfTosses != 0) {
            // Simulating a coin flip by generating a number between 0 and 1
            int flip = coinToss.nextInt(max + 1);

            if (flip == 0) { // Heads
                tossNumber++;
                System.out.println("Toss " + tossNumber + ":" + " Heads");
                numberOfHeads++;
                numberOfTosses--;
            } else { // Tails
                tossNumber++;
                System.out.println("Toss " + tossNumber + ":" + " Tails");
                numberOfTails++;
                numberOfTosses--;
            }

        }
        System.out.println("Number of heads: " + numberOfHeads);
        System.out.println("Number of tails: " + numberOfTails);

        percentHeads = ((double) numberOfHeads / 8) * 100;
        percentTails = ((double) numberOfTails / 8) * 100;

        System.out.println("Percent heads: " + percentHeads + "%");
        System.out.println("Percent tails: " + percentTails + "%");

    }

}
