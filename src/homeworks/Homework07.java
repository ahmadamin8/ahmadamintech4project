package homeworks;


import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        int num1 = (int) (Math.random() * 11),
                num2 = (int) (Math.random() * 11),
                num3 = (int) (Math.random() * 11),
                num4 = (int) (Math.random() * 11);

        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
        System.out.println("Number 3 = " + num3);
        System.out.println("Number 4 = " + num4);

        int abs1 = Math.abs(num1 - 5);
        int abs2 = Math.abs(num2 - 5);
        int abs3 = Math.abs(num3 - 5);
        int abs4 = Math.abs(num4 - 5);

        System.out.println("Absolute difference of " + num1 + " with 5 is = " + abs1);
        System.out.println("Absolute difference of " + num2 + " with 5 is = " + abs2);
        System.out.println("Absolute difference of " + num3 + " with 5 is = " + abs3);
        System.out.println("Absolute difference of " + num4 + " with 5 is = " + abs4);

        int maxValueOf1And2 = Math.max(num1, num2);
        int maxValueOf123 = Math.max(maxValueOf1And2, num3);
        int maxValueOfEvery = Math.max(maxValueOf123, num4);

        System.out.println("Greatest number is = " + maxValueOfEvery);

        int minValueOf1And2 = Math.min(num1, num2);
        int minValueOf123 = Math.min(minValueOf1And2, num3);
        int minValueOfEvery = Math.min(minValueOf123, num4);

        System.out.println("Smallest number is = " + minValueOfEvery);


        System.out.println("-----TASK 2-----");


        int number1 = (int) (Math.random() * 101) - 50;
        int number2 = (int) (Math.random() * 101) - 50;
        int number3 = (int) (Math.random() * 101) - 50;
        int number4 = (int) (Math.random() * 101) - 50;
        int number5 = (int) (Math.random() * 101) - 50;
        int number6 = (int) (Math.random() * 101) - 50;
        int number7 = (int) (Math.random() * 101) - 50;
        int number8 = (int) (Math.random() * 101) - 50;

        System.out.println("Number 1 = " + number1);
        System.out.println("Number 2 = " + number2);
        System.out.println("Number 3 = " + number3);
        System.out.println("Number 4 = " + number4);
        System.out.println("Number 5 = " + number5);
        System.out.println("Number 6 = " + number6);
        System.out.println("Number 7 = " + number7);
        System.out.println("Number 8 = " + number8);

        int maxValueOfNumber1And2 = Math.max(number1, number2);
        int maxValueOfNumber123 = Math.max(maxValueOfNumber1And2, number3);
        int maxValueOfNumber1234 = Math.max(maxValueOfNumber123, number4);
        int maxValueOfNumber12345 = Math.max(maxValueOfNumber1234, number5);
        int maxValueOfNumber123456 = Math.max(maxValueOfNumber12345, number6);
        int maxValueOfNumber1234567 = Math.max(maxValueOfNumber123456, number7);
        int maxValueOfEveryNumber = Math.max(maxValueOfNumber1234567, number8);

        System.out.println("Greatest number is = " + maxValueOfEveryNumber);

        int minValueOfNumber1And2 = Math.min(number1, number2);
        int minValueOfNumber123 = Math.min(minValueOfNumber1And2, number3);
        int minValueOfNumber1234 = Math.min(minValueOfNumber123, number4);
        int minValueOfNumber12345 = Math.min(minValueOfNumber1234, number5);
        int minValueOfNumber123456 = Math.min(minValueOfNumber12345, number6);
        int minValueOfNumber1234567 = Math.min(minValueOfNumber123456, number7);
        int minValueOfEveryNumber = Math.min(minValueOfNumber1234567, number8);

        System.out.println("Smallest number is = " + minValueOfEveryNumber);

        int avg = (number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8) / (8);

        System.out.println("Average of 8 numbers is = " + avg);

        int absolute = Math.abs(minValueOfEveryNumber - maxValueOfEveryNumber);
        System.out.println("Absolute difference between smallest and greatest is = " + absolute);

        if (number3 > 0) {
            System.out.println("3rd number is positive = true");
        } else {
            System.out.println("3rd number is positive = false");

        }
        if (number5 < 0) {
            System.out.println("5th number is negative = true");
        } else {
            System.out.println("5th number is negative = false");

            if (number1 == 0) {
                System.out.println("There is at least one zero among those numbers is = true");
            } else if (number2 == 0) {
                System.out.println("There is at least one zero among those numbers is = true");
            } else if (number3 == 0) {
                System.out.println("There is at least one zero among those numbers is = true");
            } else if (number4 == 0) {
                System.out.println("There is at least one zero among those numbers is = true");
            } else if (number5 == 0) {
                System.out.println("There is at least one zero among those numbers is = true");
            } else if (number6 == 0) {
                System.out.println("There is at least one zero among those numbers is = true");
            } else if (number7 == 0) {
                System.out.println("There is at least one zero among those numbers is = true");
            } else if (number8 == 0) {
                System.out.println("There is at least one zero among those numbers is = true");
            } else {
                System.out.println("There is at least one zero among those numbers is = false");
            }

        }
        System.out.println("End of the program!");


        System.out.println("-----TASK 3-----");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 7 numbers between 0 and 50.");

        int userNumber1 = userInput.nextInt();
        int userNumber2 = userInput.nextInt();
        int userNumber3 = userInput.nextInt();
        int userNumber4 = userInput.nextInt();
        int userNumber5 = userInput.nextInt();
        int userNumber6 = userInput.nextInt();
        int userNumber7 = userInput.nextInt();

        System.out.println("Number 1 = " + userNumber1);
        System.out.println("Number 2 = " + userNumber2);
        System.out.println("Number 3 = " + userNumber3);
        System.out.println("Number 4 = " + userNumber4);
        System.out.println("Number 5 = " + userNumber5);
        System.out.println("Number 6 = " + userNumber6);
        System.out.println("Number 7 = " + userNumber7);

        int maxValueOfUserNumber1And2 = Math.max(userNumber1, userNumber2);
        int maxValueOfUserNumber123 = Math.max(maxValueOfUserNumber1And2, userNumber3);
        int maxValueOfUserNumber1234 = Math.max(maxValueOfUserNumber123, userNumber4);
        int maxValueOfUserNumber12345 = Math.max(maxValueOfUserNumber1234, userNumber5);
        int maxValueOfUserNumber123456 = Math.max(maxValueOfUserNumber12345, userNumber6);
        int maxValueOfEveryUserNumber = Math.max(maxValueOfUserNumber123456, userNumber7);

        System.out.println("Greatest number is = " + maxValueOfEveryUserNumber);

        int minValueOfUserNumber1And2 = Math.min(userNumber1, userNumber2);
        int minValueOfUserNumber123 = Math.min(minValueOfUserNumber1And2, userNumber3);
        int minValueOfUserNumber1234 = Math.min(minValueOfUserNumber123, userNumber4);
        int minValueOfUserNumber12345 = Math.min(minValueOfUserNumber1234, userNumber5);
        int minValueOfUserNumber123456 = Math.min(minValueOfUserNumber12345, userNumber6);
        int minValueOfEveryUserNumber = Math.min(minValueOfUserNumber123456, userNumber7);

        System.out.println("Smallest number is = " + minValueOfEveryUserNumber);

        int userAvg = (userNumber1 + userNumber2 + userNumber3 + userNumber4 + userNumber5 + userNumber6 + userNumber7) / (7);

        System.out.println("Average of 7 numbers is = " + userAvg);

        if (userNumber1 >= 10) {
            System.out.println("First number is greater than or equal to 10 = true");
        } else {
            System.out.println("First number is greater than or equal to 10 = false");

            if (userNumber7 <= 40) {
                System.out.println("Last number is less than or equal to 40 = true");
            } else
                System.out.println("Last number is less than or equal to 40 = false");

            if (userNumber1 + userNumber7 > 25) {
                System.out.println("Both first and last numbers are greater than 25 = true");
            }else
                System.out.println("Both first and last numbers are greater than 25 = false");

            if (userNumber1 + userNumber2 + userNumber3 + userNumber4 + userNumber5 + userNumber6 + userNumber7 == (0|50)) {
                System.out.println("At least one of those numbers is 0 or 50 = true");
            }else
                System.out.println("At least one of those numbers is 0 or 50 = false");

            if ( userNumber1 >= 40 && userNumber1 <= 50 || userNumber2 >= 40 && userNumber2 <= 50 ||
                 userNumber3 >= 40 && userNumber3 <= 50 || userNumber4 >= 40 && userNumber4 <= 50 ||
                 userNumber5 >= 40 && userNumber5 <= 50 || userNumber6 >= 40 && userNumber6 <= 50 ||
                 userNumber7 >= 40 && userNumber7 <= 50) {
                System.out.println("There is no number between 40 and 50 = false");
            }else
                System.out.println("There is no number between 40 and 50 = true");

            }



            System.out.println("-----TASK 4-----");

            int randomNumber1 = (int) (Math.random() * 101);
            int randomNumber2 = (int) (Math.random() * 101);
            int randomNumber3 = (int) (Math.random() * 101);

            System.out.println("First number is = " + randomNumber1);
            System.out.println("First number is = " + randomNumber2);
            System.out.println("First number is = " + randomNumber3);

            if (randomNumber1 > 25 && randomNumber2 > 25 && randomNumber3 > 25) {
                System.out.println("true");
            } else
                System.out.println("false");


            System.out.println("-----TASK 5-----");

            System.out.println("Please enter a number between 1 and 7.");

            int userWeekNum = userInput.nextInt();
            System.out.println("Input number is = " + userWeekNum);

            if (userWeekNum == 1) {
                System.out.println("MONDAY");
            } else if (userWeekNum == 2) {
                System.out.println("TUESDAY");
            } else if (userWeekNum == 3) {
                System.out.println("WEDNESDAY");
            } else if (userWeekNum == 4) {
                System.out.println("THURSDAY");
            } else if (userWeekNum == 5) {
                System.out.println("FRIDAY");
            } else if (userWeekNum == 6) {
                System.out.println("SATURDAY");
            } else if (userWeekNum == 7) {
                System.out.println("SUNDAY");
            } else
                System.out.println("This is not representing any day.");


            System.out.println("-----TASK 6-----");

            System.out.println("Enter a number between -10 and 10.");

            int task6Int = userInput.nextInt();

            if (task6Int > 0) {
                System.out.println("Number entered is POSITIVE");

            } else if (task6Int < 0) {

                System.out.println("Number entered is NEGATIVE");

            } else {
                System.out.println("Number entered is ZERO");

            }
            if (task6Int % 2 == 0) {
                System.out.println("Number is EVEN");

            } else System.out.println("Number is ODD");


            System.out.println("-----TASK 7-----");

            System.out.println("Please enter all 3 of your Math Exam results.");

            int mathExam1 = userInput.nextInt();
            int mathExam2 = userInput.nextInt();
            int mathExam3 = userInput.nextInt();

            int mathExamAvg = (mathExam1 + mathExam2 + mathExam3) / (3);

            if (mathExamAvg < 70) {
                System.out.println("YOU FAILED!");
            } else
                System.out.println("YOU PASSED!");


            System.out.println("-----TASK 8-----");

            System.out.println("Please enter your 3 numbers.");

            int task8Num1 = userInput.nextInt();
            int task8Num2 = userInput.nextInt();
            int task8Num3 = userInput.nextInt();

            if(task8Num1 == task8Num2 && task8Num2 == task8Num3){
                System.out.println("TRIPLE MATCH");
            } else if(task8Num1 == task8Num2 || task8Num2 == task8Num3 || task8Num3 == task8Num1) {
                System.out.println("DOUBLE MATCH");
            }else{
                System.out.println("NO MATCH");
                System.out.println("End of the program!");



            }
        }
    }



















