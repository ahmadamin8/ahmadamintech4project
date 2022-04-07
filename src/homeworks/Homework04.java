package homeworks;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args){

        System.out.println("-----TASK 1-----");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your first number.");
        int num1 = userInput.nextInt();

        System.out.println("Please enter your second number.");
        int num2 = userInput.nextInt();

        int userAvg = (num1 + num2) / (2);

        System.out.println("The average of the given 2 numbers is: " + userAvg);


        System.out.println("-----TASK 2-----");

        System.out.println("Please enter your first number.");
        int numProduct1 = userInput.nextInt();

        System.out.println("Please enter your second number.");
        int numProduct2 = userInput.nextInt();

        int numProductEnd = (numProduct1 * numProduct2);

        System.out.println("The product of the given 2 numbers is: " + numProductEnd);


        System.out.println("-----TASK 3-----");

        System.out.println("Please enter your first number.");
        int numSquare1 = userInput.nextInt();

        System.out.println("Please enter your second number.");
        int numSquare2 = userInput.nextInt();

        System.out.println("Please enter your third number.");
        int numSquare3 = userInput.nextInt();

        int numSquareEnd1 = (numSquare1 * numSquare1);
        int numSquareEnd2 = (numSquare2 * numSquare2);
        int numSquareEnd3 = (numSquare3 * numSquare3);

        System.out.println("The " + numSquare1 + " multiplied with " + numSquare1 + " is = " + numSquareEnd1);
        System.out.println("The " + numSquare2 + " multiplied with " + numSquare2 + " is = " + numSquareEnd2);
        System.out.println("The " + numSquare3 + " multiplied with " + numSquare3 + " is = " + numSquareEnd3);

        System.out.println("-----TASK 4-----");

        System.out.println("Please enter your first number.");
        int numRemainder1 = userInput.nextInt();

        System.out.println("Please enter your second number.");
        int numRemainder2 = userInput.nextInt();

        int numRemainderEnd = (numRemainder1 % numRemainder2);

        System.out.println("The remainder of " + numRemainder1 + " % " + numRemainder2 + " = " + numRemainderEnd);

        System.out.println("-----TASK 5-----");

        System.out.println("Please enter your first number.");
        int avg1 = userInput.nextInt();

        System.out.println("Please enter your second number.");
        int avg2 = userInput.nextInt();

        System.out.println("Please enter your third number.");
        int avg3 = userInput.nextInt();

        System.out.println("Please enter your fourth number.");
        int avg4 = userInput.nextInt();

        System.out.println("Please enter your fifth number.");
        int avg5 = userInput.nextInt();

        int avgEnd = (avg1 + avg2 + avg3 + avg4 + avg5) / (5);

        System.out.println("The average of the given 5 numbers is: " + avgEnd);

        System.out.println("-----TASK 6-----");

        System.out.println("Please enter your number.");
        int numTable = userInput.nextInt();

        int numTable1 = (numTable * 1);
        int numTable2 = (numTable * 2);
        int numTable3 = (numTable * 3);
        int numTable4 = (numTable * 4);
        int numTable5 = (numTable * 5);
        int numTable6 = (numTable * 6);
        int numTable7 = (numTable * 7);
        int numTable8 = (numTable * 8);
        int numTable9 = (numTable * 9);
        int numTable10 = (numTable * 10);

        System.out.println(numTable + " * 1 = " + numTable1 + "\n" +
                           numTable + " * 2 = " + numTable2 + "\n" +
                           numTable + " * 3 = " + numTable3 + "\n" +
                           numTable + " * 4 = " + numTable4 + "\n" +
                           numTable + " * 5 = " + numTable5 + "\n" +
                           numTable + " * 6 = " + numTable6 + "\n" +
                           numTable + " * 7 = " + numTable7 + "\n" +
                           numTable + " * 8 = " + numTable8 + "\n" +
                           numTable + " * 9 = " + numTable9 + "\n" +
                           numTable + " * 10 = " + numTable10 + "\n");


        System.out.println("-----TASK 7-----");

        System.out.println("Please enter one size of your square's sides.");
        int squareSize = userInput.nextInt();

        int area = (squareSize * squareSize);
        int perimeter = (4 * squareSize);

        System.out.println("Perimeter of the square = " + perimeter);
        System.out.println("Area of the square = " + area);











    }
}
