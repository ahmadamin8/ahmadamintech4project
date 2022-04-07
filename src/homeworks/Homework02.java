package homeworks;
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        Scanner fullName = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = fullName.next();

        System.out.println("What is your last name?");
        String lastName = fullName.next();

        System.out.println("What is your age?");
        int myAge = fullName.nextInt();

        System.out.println("What is your E-mail?");
        fullName.nextLine();
        String email = fullName.nextLine();


        System.out.println("What is your phone number?");
        String myPhoneNumber = fullName.next();

        System.out.println("What is your address?");
        fullName.nextLine();
        String myAddress = fullName.nextLine();
        System.out.println("\n");


        System.out.println("\tUser who joined this program is " + firstName + " " + lastName + ". " + firstName + "'s age is " + myAge + ". " + firstName + "'s email \naddress is " + email + ", phone number " + myPhoneNumber + ", and address is\n" + myAddress + ".");



        System.out.println("-----Task 2-----");
        Scanner userInfo = new Scanner(System.in);

        System.out.println("What is your favorite book?");
        String favBook = userInfo.nextLine();

        System.out.println("What is your favorite color?");
        String favColor = userInfo.next();

        System.out.println("What is your favorite number?");
        String favNumber = userInfo.next();

        System.out.println("User's favorite book is: " + favBook+ "\n" + "User's favorite color is: " + favColor + "\n" + "User's favorite number is: " + favNumber);




    }
}
