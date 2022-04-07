package ifElseStatements.ifStatements;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your age");
        int userAge = userInput.nextInt();

        System.out.println("Please enter your weight");
        int userWeight =  userInput.nextInt();

        if (userAge > 18) {
            System.out.println("You are old enough to drive");
        }else if(userAge < 18)
            System.out.println("You are not old enough to drive");

        if (userWeight > 150) {
            System.out.println("You are heavier than 150 pounds");
        }else if(userWeight < 150)
            System.out.println("You are lighter than 150 pounds");

        }
    }
