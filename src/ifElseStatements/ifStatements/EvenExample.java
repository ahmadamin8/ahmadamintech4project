package ifElseStatements.ifStatements;
import java.util.Scanner;
public class EvenExample {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a number.");

        int userNumber = userInput.nextInt();


        if (userNumber % 2 == 0) {
            System.out.println("The number you entered is even!");

        }else{
            System.out.println("The number you entered is odd");
        }
    }
}