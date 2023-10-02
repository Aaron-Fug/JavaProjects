package com.AaronFugar;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creating Calculate Object
        Calculate calc = new Calculate();

        //Prompting user for input
        System.out.print("Enter what math operation you need (ADD, SUBTRACT, MULTIPLY, DIVIDE, POWER) : ");
        String input = sc.nextLine();
        System.out.print("Enter the Two numbers you want to operate on (number 1): ");
        double num1 = sc.nextDouble();
        System.out.print("(number 2): ");
        double num2 = sc.nextDouble();

        //Setting input values equal to other variables
        calc.input = input;
        calc.num1 = num1;
        calc.num2 = num2;
        calc.asmd();



    }
}

class Calculate {

    double num1;
    double num2;
    String input;
        public void asmd(){

            if (input.toLowerCase().equals("add")){ //Add Function
                System.out.println(num1 + num2);
            }
            else if (input.toLowerCase().equals("subtract")){ //Add Function
                System.out.println(num1 - num2);
            }
            else if(input.toLowerCase().equals("multiply")){ //Subtract Function
                System.out.println(num1 * num2);
            }
            else if(input.toLowerCase().equals("divide")){ //Divide Function
                System.out.println(num1 / num2);
            }
            else if(input.toLowerCase().equals("power")){ //Power Function
                System.out.println(Math.pow(num1,num2));
            }
            else {
                System.out.println("Invalid Input"); //Invalid case
            }
        }
}