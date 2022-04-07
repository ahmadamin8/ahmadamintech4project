package loops.controlStatements;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 2 different integers");

        int num1 = userInput.nextInt();
        int num2 = userInput.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        for (int i = max; i >= min; i--) {
            System.out.println(i);

        }
        }
    }



