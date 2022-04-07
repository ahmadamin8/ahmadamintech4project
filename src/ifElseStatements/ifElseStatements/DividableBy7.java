package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class DividableBy7 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a number");

        int userNumber = userInput.nextInt();

        if (userNumber % 7 == 0) {


            System.out.println("Your number is dividable by 7");

        } else {
            System.out.println("Your number is not dividable by 7");

        }
    }
}



