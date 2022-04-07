package ifElseStatements;

import java.util.Scanner;

public class FindTheSmallestOf2Numbers {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 2 numbers.");
        int num1 = userInput.nextInt() , num2 = userInput.nextInt();

     //   if(num1 < num2) System.out.println(num1);

     //   else System.out.println(num2);

        int smallestNumber = num1 < num2 ? num1 : num2; //ternary way

        System.out.println(smallestNumber);

        System.out.println("End of the program!");



    }
}
