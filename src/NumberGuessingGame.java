package com.AaronFugar;
import java.util.Scanner;
public class NumberGuessingGame {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  int computerGeneratedNumber = Math.random();

        double doubleRandomNumber = Math.random() * 5000;
        // cast the double to whole number
        int computerGeneratedNumber = (int)doubleRandomNumber;


        System.out.print("Try and Guess My Number (Between 0 - 5000): ");
        int userGuess = sc.nextInt();

        TooLowTooHigh highOrLow = new TooLowTooHigh();

        highOrLow.userGuess = userGuess;
        highOrLow.computerGeneratedNumber = computerGeneratedNumber;

        highOrLow.highOrLow();
    }

}

class TooLowTooHigh {
    int userGuess;
    int computerGeneratedNumber;
    public void highOrLow() {
        Scanner sc = new Scanner(System.in);
        while (userGuess != computerGeneratedNumber) {
            if(userGuess < computerGeneratedNumber) {
                System.out.println("Your Guess Was Too Low! Try Again: ");
            } else {
                System.out.println("Your Guess Was too High! Try Again: ");
            }
            userGuess = sc.nextInt();
        }
            System.out.println("You are Correct! My Number was " + computerGeneratedNumber + "!");
    }
}