package loops.doWhileLoop;

import java.util.Scanner;
public class AskUser10 {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner userInput = new Scanner(System.in);
        int userNum = userInput.nextInt();
        while(userNum < 10){
            System.out.println("This number is not more than or equal to 10");
            System.out.println("Please enter a new number");
            userNum = userInput.nextInt();
        }
        System.out.println("This number is more than or equal to 10");

        }
}

