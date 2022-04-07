package scanner;

import java.util.Scanner;
public class SolvingScannerNextLineProblem {
    public static void main(String[] args) {

        /*
        name --> next()
        age --> nextInt()
        myBrainOK --> nextBoolean()
        address --> nextLine()

         */

//        Scanner userInput = new Scanner(System.in);
//        System.out.println("What is your name");
//        String name = userInput.next();

       // System.out.println("What is your age");
      //  int age = userInput.nextInt();

      //  System.out.println("Is your brain fried");
      //  boolean myBrainOk = userInput.nextBoolean();

       // System.out.println("What's your address");
      //  userInput.nextLine();
      //  String address = userInput.nextLine();

      //  System.out.println("User name is = " + name + "\nUser age is " + age + "\nIs user's brain OK? = " + myBrainOk + "\nWhat's your address = " + address);


        Scanner userNumbers = new Scanner(System.in);
        System.out.println("Please enter your first number");
        int firstNumber = userNumbers.nextInt();

        System.out.println("Please enter your second number");
        int secondNumber = userNumbers.nextInt();

        System.out.println("Please enter your third number");
        int thirdNumber = userNumbers.nextInt();

        System.out.println("Sum of the numbers = "+ (firstNumber + secondNumber + thirdNumber));




    }
}
