package mathClass;

import java.util.Scanner;

public class ExerciseMaxAndMin {
    public static void main(String[] args) {

//        int x = 4;
//        int y = 67;
//        int z = -54;
//
//        int minOfXY = Math.min(x, y);
//        int maxOfXY = Math.max(x, y);
//
//        int minOfXYZ = Math.min(minOfXY, z);
//        int maxOfXYZ = Math.max(maxOfXY, z);
//
//        System.out.println(minOfXYZ);
//        System.out.println(maxOfXYZ);
//



        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter 4 numbers");

        int a = userInput.nextInt();
        int b = userInput.nextInt();
        int c = userInput.nextInt();
        int d = userInput.nextInt();

      //  int minOfAB = Math.min(a, b);

      //  int minOfABC = Math.min(Math.min(a, b), c);

        Math.max(a, b); // one single number / num1, num2
        Math.max(c, d); // one single number / num3, num4
        Math.max(Math.max(a, b), Math.max(c, d));

        Math.min(a, b); // one single number / num1, num2
        Math.min(c, d); // one single number / num3, num4
        Math.min(Math.min(a, b), Math.min(c, d));

        System.out.println("The smallest number you entered is = " + Math.min(Math.min(a, b), Math.min(c, d)));
        System.out.println("The biggest number you entered is = " + Math.max(Math.min(a, b), Math.max(c, d)));




    }
}
