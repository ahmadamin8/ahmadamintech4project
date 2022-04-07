package scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LearningScannerPrimitiveMethods {
    public static void main(String[] args) {
        /*
        How to use Scanner methods
        1. Create an object of Scanner (import the class as well)
        ClassName/DataType variableName/objectName = new ClassName/DataType(if it is needed);
        2. variableName/objectName.methodName(if it is needed parameter);
         */

        /*
        Task -1
        1. Ask user to enter their age
        2. Print the question
        3. Use the proper next method (nextInt)
        4. Print out the user's age
         */




        Scanner collect = new Scanner(System.in);

        System.out.println("Please enter your age");
        int userAge = collect.nextInt();

        System.out.println("The user age is = " + userAge);

        System.out.println("Enter your account balance");
        float userBalance = collect.nextFloat();

        System.out.println("The user balance is = " + userBalance);

        /*
        Ask for user to "Are you understanding this java class today?"
        Get the answer and store it
        Print the answer
         */

        System.out.println("Are you understanding this java class today?");
        boolean userAnswer = collect.nextBoolean();
        System.out.println("The user's answer is = \""+ userAnswer +"\"");








    }
}
