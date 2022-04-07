package arrays;

import java.util.Arrays;
import java.util.Locale;

public class FruitsCollection {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        String[] fruits = new String[4];
        System.out.println(Arrays.toString(fruits));


        System.out.println("-----TASK 2-----");

        fruits[0]= "Apple";
        fruits[3]= "Orange";
        System.out.println(Arrays.toString(fruits));

        System.out.println("-----TASK 3-----");

        System.out.println(fruits.length);


        System.out.println("-----TASK 4-----");
        System.out.println(fruits[0]);
        System.out.println(fruits[3]);
        System.out.println(fruits[0].toUpperCase());
        System.out.println(fruits[0].charAt(0));
        System.out.println(fruits[3].length());
        System.out.println(fruits[3].startsWith("O"));



    }
}
