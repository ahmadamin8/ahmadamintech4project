package ifElseStatements;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        /*
       Write a program to ask user to enter which day it is (1 to 5)
       Based on the answer print what color will be selected
       1.Monday -> Blue
       2.Tuesday -> Red
       3.Wednesday -> Purple
       4.Thursday -> Yellow
       5. Friday -> Orange
         */

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a number from 1 to 5.");
        int userNumber = userInput.nextInt();

        if (userNumber == 1) {
            System.out.println("Blue");
        } else if (userNumber == 2) {
            System.out.println("Red");
        } else if (userNumber == 3) {
            System.out.println("Purple");
        } else if (userNumber == 4) {
            System.out.println("Yellow");
        } else if (userNumber == 5) {
            System.out.println("Orange");
        } else if (userNumber == 6 || userNumber ==7) {
            System.out.println("It is weekend!");
        }else{
            System.out.println("This is not representing any program");


        }
        System.out.println("End of the program");

    }
}







