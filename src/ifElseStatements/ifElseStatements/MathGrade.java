package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class MathGrade {
    public static void main(String[] args) {


        System.out.println("Enter your balance");

        Scanner userInput = new Scanner(System.in);
        double myBalance = userInput.nextInt();

        if (myBalance >= 600.0) {
            System.out.println("You have enough money!");


        } else {
            System.out.println("Sorry! You are poor!");
        }
    }
}