package homeworks;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        String s1 = "5";
        String s2 = "10";

        int num1Int = Integer.parseInt(s1);
        int num2Int = Integer.parseInt(s2);

        int sum = num1Int + num2Int;

        int product = num1Int * num2Int;

        int division = num1Int / num2Int;

        int sub = num1Int - num2Int;

        int remainder = num1Int % num2Int;

        System.out.println("Sum of 5 and 10 is = " + sum);
        System.out.println("Product of 5 and 10 is = " + product);
        System.out.println("Division of 5 and 10 is = " + division);
        System.out.println("Subtraction of 5 and 10 is = " + sub);
        System.out.println("Remainder of 5 and 10 is = " + remainder);


        System.out.println("-----TASK 2-----");

        String str1 = "200";
        String str2 = "-50";

        int numberInt1 = Integer.parseInt(str1);
        int numberInt2 = Integer.parseInt(str2);

        int max =  Math.max(numberInt1 , numberInt2);

        int min = Math.min(numberInt1 , numberInt2);

        int average = (numberInt1 + numberInt2) / (2);

        int abs = Math.abs(numberInt1 - numberInt2);

        System.out.println("The greatest value is = " + max);
        System.out.println("The smallest value is = " + min);
        System.out.println("The average is = " + average);
        System.out.println("The absolute difference is = " + abs);

        System.out.println("-----TASK 3-----");

        double everyDay = .96;
        /*
        .96 comes from the daily savings which are 3 quarters which equal to 75 cents,
         1 dime which equals to 10 cents, 2 nickels which also equal to 10 cents, and lastly 1 penny
         which equals to 1 cent, in total a saving og 96 cents per day which is .96 of 1 dollar
        */

        double firstDouble = (24 / everyDay);
        double secondDouble = (168 / everyDay);
        double thirdDouble = (150 * everyDay );

        System.out.println((int) firstDouble + " days");
        System.out.println((int) secondDouble + " days");
        System.out.println("$" + thirdDouble);


        System.out.println("-----TASK 4-----");

        double jessieSave = (1250 / 62.5);

        System.out.println((int) +jessieSave);


        System.out.println("-----TASK 5-----");

        double danOption1 = (14265 / 475.50);
        double danOption2 = (14265 / 951);

        System.out.println("Option 1 will take " + (int) (danOption1) + " months");
        System.out.println("Option 2 will take " + (int) (danOption2) + " months");


        System.out.println("-----TASK 6-----");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your first number");
        int firstNum = userInput.nextInt();

        System.out.println("Please enter your second number");
        int secondNum = userInput.nextInt();


        System.out.println((double) firstNum / secondNum);









    }
}
