package methods;
import utilities.MathHelper;

import java.util.Scanner;

public class FindIfNumberIsPosNegOrZero {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number");

        int num1 = userInput.nextInt();
        System.out.println("The number the user entered is = " + num1);

        if (MathHelper.isPositive(num1)) {
            System.out.println("The number is positive");
        } else if (MathHelper.isNegative(num1)) {
            System.out.println("The number entered is negative");

        }else if(MathHelper.isZero(num1)){
            System.out.println("The number entered is zero");

        }
    }
}

