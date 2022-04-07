package homeworks;

import utilities.ScannerHelper;

import java.util.Locale;
import java.util.Scanner;

public class Homework09 {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your first name.");

        String name = userInput.nextLine();

        int length = name.length();
        System.out.println("The length of the name is = " + length);

        System.out.println("The first character in the name is = " + name.charAt(0));

        System.out.println("The last character in the name is = " + name.charAt(name.length() - 1));

        System.out.println("The first three characters in the name are = " + name.substring(0, 3));

        System.out.println("The last three characters in the name are = " + name.substring(name.length() - 3));

        if (name.startsWith("a") || name.startsWith("A")) {
            System.out.println("You are in the club!");
        } else {
            System.out.println("Sorry, you are not in the club.");
        }


        System.out.println("-----TASK 2-----");

        System.out.println("Please enter your full address.");

        String address = userInput.nextLine();

        if (address.toLowerCase().contains("chicago")) {
            System.out.println("You are in the club");
        } else if (address.toLowerCase().contains("des plaines")) {
            System.out.println("You are welcome to join the club");
        } else {
            System.out.println("Sorry, you will never be in the club");
        }


        System.out.println("-----TASK 3-----");

        System.out.println("Please enter at least 4 colors");

        String colors = ScannerHelper.getAStringFromUser();

        if(colors.toLowerCase().contains("red") || colors.toLowerCase().contains("green")){
            if(colors.toLowerCase().contains("red") && !colors.toLowerCase().contains("green")){
                System.out.println("Red is in the list");
            }
            else if(colors.toLowerCase().contains("green") && !colors.toLowerCase().contains("red")){
                System.out.println("Green is in the list");
            }
            else System.out.println("Green and red are in the list");
        }
        else System.out.println("Green and red are not in the list");

        System.out.println("-----TASK 4-----");

        String str = "   Java is FUN   ";

        String first = str.trim().toLowerCase().substring(0, 4);
        String second = str.trim().toLowerCase().substring(5, 7);
        String third = str.trim().toLowerCase().substring(8, 11);

        System.out.println("The first word in the str is = " + first);
        System.out.println("The second word in the str is = " + second);
        System.out.println("The third word in the str is = " + third);

        System.out.println("End of the program!");


    }
}
