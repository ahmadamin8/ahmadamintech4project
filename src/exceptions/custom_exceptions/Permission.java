package exceptions.custom_exceptions;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Permission {

    public static void checkAge(int age) {

        if (age > 16) System.out.println("it is allowed to have driver license");

        else throw new RuntimeException("Age of " + age + " is not allowed to have driver license");
    }
    public static void checkIn(int day){
        switch (day){
            case 1:
            case 7:
                System.out.println("user is allowed to check in 10 AM to 3 PM");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("user is allowed to check in 10 AM to 5 PM");
                break;
            default:
                throw new RuntimeException("The input does not represent any day!!!");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey user! Please enter your age?");
        int age = scan.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Your age is = " + age);
        }
        System.out.println("End of the program!");


        System.out.println("\n\n-----");

        checkIn(8);
    }
}




