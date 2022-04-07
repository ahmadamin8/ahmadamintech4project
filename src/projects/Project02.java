package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter all your numbers.");
        int num1 = userInput.nextInt();


        int num2 = userInput.nextInt();


        int num3 = userInput.nextInt();

        System.out.println("The product of the numbers entered is = " + (num1 * num2 * num3));


        System.out.println("-----TASK 2-----");

        System.out.println("What is your first name?");
        String firstName = userInput.next();

        System.out.println("What is your last name?");
        String lastName = userInput.next();

        System.out.println("What is your year of birth?");
        int yearOfBirth = userInput.nextInt();

        int currentYear = 2022;

        System.out.println(firstName + " " + lastName + "'s age is = " + (currentYear - yearOfBirth + "."));


        System.out.println("-----TASK 3-----");

        System.out.println("What is your full name?");
        userInput.nextLine();
        String fullName = userInput.nextLine();

        System.out.println("What is your weight in kg?");
        int weightKg = userInput.nextInt();

        System.out.println(fullName + "'s weight is = " + (weightKg * 2.205 + " lbs."));


        System.out.println("-----TASK 4-----");

        System.out.println("What is your full name?");
        userInput.nextLine();
        String fullName2 = userInput.nextLine();

        System.out.println("What is your age?");
        int userAge = userInput.nextInt();

        System.out.println("What is your full name?");
        userInput.nextLine();
        String fullName3 = userInput.nextLine();

        System.out.println("What is your age?");
        int userAge2 = userInput.nextInt();

        System.out.println("What is your full name?");
        userInput.nextLine();
        String fullName4 = userInput.nextLine();

        System.out.println("What is your age?");
        int userAge3 = userInput.nextInt();

        int avgAge = (userAge + userAge2 + userAge3) / (3);



        int minOfXY = Math.min(userAge, userAge2);
        int maxOfXY = Math.max(userAge,userAge2);

        int smallest = Math.min(minOfXY, userAge3);
        int oldest = Math.max(maxOfXY, userAge3);

        System.out.println(fullName2 + "'s age is " + userAge + "." +  "\n"
                + fullName3 + "'s age is " + userAge2 + "." + "\n"
                + fullName4 + "'s age is " + userAge3 + "." + "\n"
                + "The average is age is " + avgAge + "." + "\n"
                + "The eldest age is " + oldest + "." + "\n"
                + "The youngest age is " + smallest + ".");







    }
}
