package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        System.out.println("---Task 2---");

       Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your birth date year");

        int age = userInput.nextInt();

        Date thisYear = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        sdf.format(thisYear);

        System.out.println("You are " + (Integer.parseInt(sdf.format(thisYear)) - age + " years old!"));

    }
}
