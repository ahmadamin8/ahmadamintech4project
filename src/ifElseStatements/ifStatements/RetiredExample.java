package ifElseStatements.ifStatements;

import java.util.Scanner;
public class RetiredExample {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your age");
        int myAge = userInput.nextInt();


        boolean isAgeUnder55 = myAge <= 55;


        boolean isAgeAbove55 = myAge >= 55;

        if (myAge >= 55) {
            System.out.println("It is time to retire");
            /*
            1. Create a scanner object
            2. Ask a question about their age
            3. Retrieve age
            4. Use if statement and proper action in curly braces
             */
        }else{
            System.out.println("Do not retire");
        }
    }
}