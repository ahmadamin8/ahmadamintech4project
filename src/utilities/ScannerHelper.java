package utilities;

import java.util.Scanner;

public class ScannerHelper {

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public static String getAStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.nextLine();
        return string;

    }
}
