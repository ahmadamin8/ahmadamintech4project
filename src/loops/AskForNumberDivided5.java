package loops;

import utilities.ScannerHelper;
import java.util.Scanner;

public class AskForNumberDivided5 {
    public static void main(String[] args) {

        Scanner userNumber = new Scanner(System.in);
        int number;
        do{
            System.out.println("Please enter a number");
            number = userNumber.nextInt();

             if(number % 5 != 0) System.out.println("This number is not divisible by 5");

        }while(number % 5 != 0);
        System.out.println("This number is divisible by 5");
    }
}
