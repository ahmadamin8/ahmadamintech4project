package casting;

import java.util.Scanner;

public class ExerciseRecap {
    public static void main(String[] args) {

        /*
        Write a program ASK user for 5 of their grades and print out their avg

        Input:
        45
        50
        55
        65
        78

        Output:
        55
         */

//        System.out.println("Please enter 5 of your grades.");
//
       Scanner userInput = new Scanner(System.in);
//
//        String num1 = userInput.next();
//        String num2 = userInput.next();
//        String num3 = userInput.next();
//        String num4 = userInput.next();
//        String num5 = userInput.next();
//
//        double numDouble1 = Double.parseDouble(num1);
//        double numDouble2 = Double.parseDouble(num2);
//        double numDouble3 = Double.parseDouble(num3);
//        double numDouble4 = Double.parseDouble(num4);
//        double numDouble5 = Double.parseDouble(num5);
//
//        System.out.println("The average is = " + (numDouble1 + numDouble2 + numDouble3 + numDouble4 + numDouble5) / (5));
//
//
//        System.out.println("What is your balance.");
//
//        String balance = userInput.next();
//
//        System.out.println("What is your next 3 transactions");
//
//        String tran1 = userInput.next();
//        String tran2 = userInput.next();
//        String tran3 = userInput.next();
//
//
//        Double balanceNum = Double.valueOf(balance);
//        Double transaction1 = Double.valueOf(tran1);
//        Double transaction2 = Double.valueOf(tran2);
//        Double transaction3 = Double.valueOf(tran3);
//
//        System.out.println("Your balance is now " + (balanceNum - transaction1 - transaction2 - transaction3));


        System.out.println("Please enter your full name.");

        String fullName = userInput.nextLine();

        System.out.println("What is your age?");

        String age = userInput.next();
        userInput.nextLine();

        System.out.println("What is your phone number?");

        String phoneNumber = userInput.nextLine();

        System.out.println("Enter your kids' ages.");

        String ageKid1 = userInput.next();
        String ageKid2 = userInput.next();
        String ageKid3 = userInput.next();


        int age1 = Integer.parseInt(ageKid1);
        int age2 = Integer.parseInt(ageKid2);
        int age3 = Integer.parseInt(ageKid3);

        Math.max(age1 , age2);
        Math.max(Math.max(age1 , age2) , age3);
        int oldest = Math.max(age3, Math.max(age1 , age2));

        Math.min(age1 , age2);
        Math.min(Math.min(age1 , age2) , age3);
        int youngest = Math.min(age3, Math.max(age1 , age2));

        int ageDifference = Math.abs(oldest - youngest);
        Math.abs(oldest - youngest);

        System.out.println("Your name is " + fullName
                + " \nyour phone number is " + phoneNumber
                + ", \nyou are " + age + " years old, \nYour oldest kid is "
                + oldest + " years old, \nyour youngest kid is " + youngest
                + ", \ndifference between oldest and youngest is " + ageDifference + " years");
     ;











    }
}
