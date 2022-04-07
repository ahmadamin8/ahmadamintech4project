package homeworks;

import java.util.Scanner;

public class Homework05 {
    public static void main (String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.println("-----TASK 1-----");

        System.out.println("Please enter your first number.");
        int num1 = userInput.nextInt();

        System.out.println("Please enter your second number.");
        int num2 = userInput.nextInt();

        System.out.println("Please enter your third number.");
        int num3 = userInput.nextInt();

        Math.max(num1 , num2);
        Math.max(Math.max(num1 , num2) , num3);

        Math.min(num1 , num2);
        Math.min( Math.min(num1 , num2) , num3);

        System.out.println("Max value = " +  Math.max(Math.max(num1 , num2) , num3));
        System.out.println("Min value = " + Math.min( Math.min(num1 , num2) , num3));


        System.out.println("-----TASK 2-----");

        System.out.println("Please enter your first number.");
        int userNum1 = userInput.nextInt();


        System.out.println("Please enter your second number.");
        int userNum2 = userInput.nextInt();


        System.out.println("Please enter your third number.");
        int userNum3 = userInput.nextInt();


        System.out.println("Please enter your fourth number.");
        int userNum4 = userInput.nextInt();


        System.out.println("Please enter your fifth number.");
        int userNum5 = userInput.nextInt();


       int maxValueOf1And2 =  Math.max(userNum1 , userNum2);

       int maxValueOf123 = Math.max(maxValueOf1And2 , userNum3);

       int maxValueOf45 = Math.max(userNum4 , userNum5);

       int maxValueOfEvery = Math.max(maxValueOf123 , maxValueOf45);


        int minValueOf1And2 =  Math.min(userNum1 , userNum2);

        int minValueOf123 = Math.min(minValueOf1And2 , userNum3);

        int minValueOf45 = Math.min(userNum4 , userNum5);

        int minValueOfEvery = Math.min(minValueOf123 , minValueOf45);

        System.out.println("Max value = " + maxValueOfEvery);
        System.out.println("Min value = " + minValueOfEvery);


        System.out.println("-----TASK 3-----");

        System.out.println("Please enter your first number.");
        int absNum1 = userInput.nextInt();

        System.out.println("Please enter your second number.");
        int absNum2 = userInput.nextInt();

        System.out.println("The difference between numbers is = " + Math.abs(absNum1 - absNum2));


        System.out.println("-----TASK 4-----");

        int random1 = (int) (Math.random() * 51) + 50;
        int random2 = (int) (Math.random() * 51) + 50;
        int random3 = (int) (Math.random() * 51) + 50;

        System.out.println("Number 1 = " + random1);
        System.out.println("Number 2 = " + random2);
        System.out.println("Number 3 = " + random3);
        System.out.println("The sum of numbers is = " + (random1 + random2 + random3));


        System.out.println("-----TASK 5-----");

        int alexMoney = 125;
        int mikeMoney = 220;

        double alexDouble = 25.5;

        double alexMoneyAfter = ((alexMoney - 25.5));
        double mikeMoneyAfter = ((mikeMoney + 25.5));

        System.out.println("Alex's money: $" + alexMoneyAfter);
        System.out.println("Mike's money: $" + mikeMoneyAfter);


        System.out.println("-----TASK 6-----");

        double davidSave = (390 / 15.60);

        System.out.println( (int) davidSave);













    }
}
