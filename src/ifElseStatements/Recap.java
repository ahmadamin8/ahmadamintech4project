package ifElseStatements;

import java.util.Scanner;

public class Recap {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please tell me what time is it?");
        int hour = userInput.nextInt();

        if (hour > 6 && hour < 12) { // true

            System.out.println("Good morning");
        } else if (hour > 17 && hour < 20) { // false

            System.out.println("Good evening");
        } else if (hour > 20 && hour < 24) { // false
            System.out.println("Good night");
        }
        else{
            System.out.println("Good bye!");
        }
        System.out.println("End of the program!");

    }
}
