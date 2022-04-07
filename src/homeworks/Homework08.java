package homeworks;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        int task1Int = (int) (Math.random() * 51);
        System.out.println("Random number is = " + task1Int);

        if(task1Int >= 10 && task1Int <= 25){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        System.out.println("-----TASK 2-----");

        int task2Int = (int) (Math.random() * 100) + 1;
        System.out.println("Random number is = " + task2Int);

        if(task2Int >= 1 && task2Int <= 25){
            System.out.println(task2Int + " is in the 1st half \n" + task2Int + " is in the 1st quarter");

        }else if(task2Int >= 26 && task2Int <= 50){
            System.out.println(task2Int + " is in the 1st half \n" + task2Int + " is in the 2nd quarter");

        }else if(task2Int >= 51 && task1Int <= 75){
            System.out.println(task2Int + " is in the 2nd half \n" + task2Int + " is in the 3rd quarter");

        }else if(task2Int >= 76 && task2Int <= 100){
            System.out.println(task2Int + " is in the 2nd half \n" + task2Int + " is in the 4th quarter");

        }
        System.out.println("-----TASK 3-----");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 5 numbers between 1 to 10");
        int userNum1 = userInput.nextInt();
        int userNum2 = userInput.nextInt();
        int userNum3 = userInput.nextInt();
        int userNum4 = userInput.nextInt();
        int userNum5 = userInput.nextInt();

        int finalNum1 = userNum1 * 5;
        int finalNum2 = userNum2 * 4;
        int finalNum3 = userNum3 * 3;
        int finalNum4 = userNum4 * 2;
        int finalNum5 = userNum5 * 1;

        System.out.println(finalNum1 + finalNum2 + finalNum3 + finalNum4 + finalNum5);


    }

}
