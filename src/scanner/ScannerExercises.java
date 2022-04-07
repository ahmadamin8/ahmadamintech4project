package scanner;
import java.util.Scanner;
public class ScannerExercises {
    public static void main(String[] args) {

        Scanner fullName = new Scanner(System.in);
        System.out.println("What is your first name");
        String firstName = fullName.next();
        System.out.println("What is your last name");
        String lastName = fullName.next();
        System.out.println("The user's full name is = " + firstName + " " + lastName);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your address");
        String address = scanner.nextLine();
       System.out.println("The user's full address is = " + address);

        /*
        Pseudo Code:
        1. Create an object of scanner (import)
        2. Print out instructions about what we need
        3. Use next() method for reading
        4. Print out the first and last name in one statement
         */

        /*
        Pseudo Code 2:
        1. Create an object of Scanner
        2. Print out the question
        3. Get the address by the nextLine() method and store it
        4. Print out the user's address
         */


    }
}
