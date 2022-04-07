package stringMethods;
import java.util.Scanner;

public class PracticeFirstAndLastChar {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your first name");
        String name = userInput.nextLine();

        System.out.println("First character in the name is = " + name.charAt(0));
        System.out.println("Last character in the name is = " + name.charAt(name.length()-1));
    }
}
