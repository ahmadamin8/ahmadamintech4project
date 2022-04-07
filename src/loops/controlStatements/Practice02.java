package loops.controlStatements;
import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 2 different integers between 0 and 10");

        int num1 = userInput.nextInt();
        int num2 = userInput.nextInt();

        int max = Math.max(num1 , num2);
        int min = Math.min(num1 , num2);

        for (int i = min; i <= max; i++) {
            if(i == 5) continue;
            System.out.println(i);
            /*
            1. Ask user to enter 2 numbers between 0 and 10
            2. Store numbers in int variables
            3. Find min and max
            4. Use loop for min and max (not printing 5)
             */

        }
    }
}
