package operator;
import sun.reflect.annotation.EnumConstantNotPresentExceptionProxy;

import javax.sound.sampled.EnumControl;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        System.out.println("-----TASK 1-----");
        /*
        -Pseudo code TASK 1
        -Write a program that asks user to enter 2 numbers.
        -Store these data in int variables.
        -Print the numbers entered by user with proper messages.
        -Then, print the sum of the given numbers with a proper message.
         */

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your first number.");
        int number1 = userInput.nextInt();

        System.out.println("Please enter your second number.");
        int number2 = userInput.nextInt();

        int sum = number1 + number2;

        System.out.println("The number 1 entered by user is = " + number1);
        System.out.println("The number 2 entered by user is = " + number2);
        System.out.println("The sum of number 1 and 2 entered by user is = " + sum);


        System.out.println("-----TASK 2-----");
        /*
        -Pseudo code TASK 2
        -Write a program that asks user to enter 2 floating numbers.
        Store these data in double variables
        -Print the numbers entered by the user with proper messages.
        -Then, print the division of the given numbers with a proper message.
         */

        System.out.println("Please enter your first number.");
        double double1 = userInput.nextDouble();

        System.out.println("Please enter your second number.");
        double double2 = userInput.nextDouble();

        double div = double1 / double2;

        System.out.println("The number 1 entered by user is = " + double1);
        System.out.println("The number 2 entered by user is = " + double2);
        System.out.println("The division of number 1 and 2 entered by user is = " + div);

        System.out.println("-----TASK 3-----");
        /*
        -Pseudo code TASK 3
        -Write a java program to print the result of the following operations.
         */

        int numA = -10;
        int numB = 7;
        int numC = 5;
        int numD = 72;
        int numE = 24;
        int numF = 10;
        int numG = -3;
        int numH = 9;
        int numI = 18;
        int numJ = 3;
        int numK = 6;

        int task1 = numA + numB * numC;
        int task2 = (numD + numE) % numE;
        int task3 = numF + numG * numH / numH;
        int task4 = numC + numI / numJ * numJ - (numK % numJ);

        System.out.println("1. " + task1);
        System.out.println("2. " + task2);
        System.out.println("3. " + task3);
        System.out.println("4. " + task4);


        System.out.println("-----TASK 4-----");
        /*
        -Pseudo code TASK 4
        -Write a program that asks users to enter 2 floating numbers.
        -Store these data in double variables.
        -First, print the numbers entered by user with proper messages.
        -Then, print the sum, multiplication, subtraction, division, and remainder for the 2 numbers that were given.
         */

        System.out.println("Please enter your first number.");
        double doubleOne = userInput.nextFloat();

        System.out.println("Please enter your second number.");
        double doubleTwo = userInput.nextFloat();

        double sumDouble = doubleOne + doubleTwo;
        double timesDouble = doubleOne * doubleTwo;
        double subDouble = doubleOne - doubleTwo;
        double divDouble = doubleOne / doubleTwo;
        double remDouble = doubleOne % doubleTwo;

        System.out.println("The sum of the given numbers is = " + sumDouble);
        System.out.println("The product of the given numbers is = " + timesDouble);
        System.out.println("The subtraction of the given numbers is = " + subDouble);
        System.out.println("The division of the given numbers is = " + divDouble);
        System.out.println("The remainder of the given numbers is = " + remDouble);


        System.out.println("-----TASK 5-----");
        /*
        -Pseudo code TASK 5
        -Write a java program to print the area and perimeter of a rectangle.
         */

        double numA1 = 7.5;
        double  numB1 = 10.5;

        double timesA = numA1 * numB1;
        System.out.println("The area of the rectangle = " + timesA);

        double perimeter = 2 * (numA1 + numB1);
        System.out.println("The perimeter of the rectangle = " + perimeter);

        System.out.println("-----TASK 6-----");
        /*
        -Pseudo code TASK 6
         -Write a java program to find out how much money can a Software Engineer in test earn in 3 years.
         */

        double avgSalary = 90_000.00;

        double avgSalary3 = avgSalary * 3;

        System.out.println("A Software Engineer in Test can earn " + avgSalary3 + " in 3 years.");






    }
}








