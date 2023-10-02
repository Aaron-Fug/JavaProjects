package com.AaronFugar;
import java.util.Scanner;

public class ReverseString { //Create a "main" class called Reverse String
    public static void main(String[] args) { //main argument
        Scanner sc = new Scanner(System.in);// Scanner Object
        System.out.print("Enter the String: "); // Prompting User for a response
        String regularString = sc.nextLine(); // Storing the response as a String

        Reverse reverse = new Reverse(); // The Reverse Object for string reversal
        reverse.regularString = regularString; //Setting the input equal to Reverse class
        reverse.stringLength = regularString.length(); //Setting the input equal to Reverse class

        reverse.reverseIt(); //Calling the reverse object
    }
}

class Reverse{
  // Initializing Variables
    String regularString;
    int stringLength;
    char pulledChar;

    // Reverse Method
    public void reverseIt(){
        for(int i = stringLength; i > 0; i--) {
            pulledChar = regularString.charAt(i - 1);
            System.out.print(pulledChar);
        }

    }
}