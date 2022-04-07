package stringMethods;
import java.util.Scanner;

public class PracticeLength {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your favorite book");
        String s1 = userInput.nextLine();

        System.out.println("Enter your favorite quote");
        String s2 = userInput.nextLine();

        int size1 = s1.length();
        int size2 = s2.length();

        System.out.println("First length of string is = " + size1);
        System.out.println("Second length of string is = " + size2);
    }
}
