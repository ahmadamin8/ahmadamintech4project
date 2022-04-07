package homeworks;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");
        String task1 = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) task1 += i + " - ";

        }
        if (!task1.isEmpty()) System.out.println(task1.substring(0, task1.length() - 3));


        System.out.println("-----TASK 2-----");
        String task2 = "";

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0 && i % 3 == 0) task2 += i + " - ";

        }
        if (!task2.isEmpty()) System.out.println(task2.substring(0, task2.length() - 3));


        System.out.println("-----TASK 3-----");
        String task3 = "";

        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) task3 += i + " - ";

        }
        if (!task3.isEmpty()) System.out.println(task3.substring(0, task3.length() - 3));


        System.out.println("-----TASK 4-----");

        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + i * i);

        }
        System.out.println("-----TASK 5-----");
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);


        System.out.println("-----TASK 6-----");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a positive number");

        int factorial = 1;
        int number = userInput.nextInt();
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        userInput.nextLine();


        System.out.println("-----TASK 7-----");
        System.out.println("Please enter your first and last name");
        String task7String = userInput.nextLine();

        int vowels = 0;

        for (int i = task7String.indexOf(task7String.charAt(0)); i < task7String.length(); i++) {
            char task7Char = task7String.toLowerCase().charAt(i);
            if (task7Char == 'a' || task7Char == 'e' || task7Char == 'i' || task7Char == 'o' || task7Char == 'u') {
                vowels ++;
            }
        }
        System.out.println("There are " + vowels + " vowel letters in this full name");


        System.out.println("-----TASK 8-----");

        int task8Sum = 0;

        int userNum8;

        do {
            System.out.println("Please enter a number");
            userNum8 = userInput.nextInt();
            task8Sum += userNum8;

        }
        while (task8Sum < 100);
        if(userNum8 > 100) System.out.println("This number is already more than 100");
        else System.out.println("Sum of the entered numbers is at least 100");


        System.out.println("-----TASK 9-----");
        System.out.println("Please enter a number");

        int userNum = userInput.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3;

        String task9String = "";

        for (int i = 0; i < userNum; i++) {
            task9String+= num1 + " - ";
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

        }
        System.out.println(task9String.substring(0 , task9String.length()-3));

        userInput.nextLine();


        System.out.println("-----TASK 10-----");

        System.out.println("Please enter a name");
        String userString = userInput.nextLine();

        while(!userString.startsWith("j") && !userString.startsWith("J")){
            System.out.println("Please enter a name");
            userString = userInput.nextLine();
        }
        System.out.println("End of the program");

    }
}









