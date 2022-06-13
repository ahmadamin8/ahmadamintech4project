package homeworks;

import java.util.ArrayList;
import java.util.Collections;

public class Homework21 {

    //Task 1
    public static void fizzBuzz1(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0 && i % 3 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    //Task 2
    public static String fizzBuzz2(int num) {
        if (num % 5 == 0 && num % 3 == 0) return ("FizzBuzz");
        else if (num % 3 == 0) return ("Fizz");
        else if (num % 5 == 0) return ("Buzz");
        else return String.valueOf(num);
    }
    //Task 3

    public static int findSumNumbers(String str) {
        int sum = 0;
        for(String element: str.split("[^0-9]")){
            if (element.isEmpty()) sum+= Integer.parseInt(element);
        }
        return sum;
    }

    //Task 4

    public static int findBiggestNumber(String str) {
        int biggestNum = 0;
        for(String element: str.split("[\\D]")){
            if(!element.isEmpty() && Integer.parseInt(element) > biggestNum) biggestNum = Integer.parseInt(element);
        }
        return biggestNum;
    }

    //Task 5
    public static String countSequenceOfCharacters(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str.length() == 0) return "";
        else {
            for (int i = 0; i < str.length() - 1; i++) {
                int count = 1;
                if (str.charAt(i) == str.charAt(i + 1)) {
                    i = i + count - 1;
                }
                stringBuilder.append(String.valueOf(count)).append(str.charAt(i));
            }
            if (!(str.charAt(str.length() - 2) == str.charAt(str.length() - 1)))
                stringBuilder.append("1").append(str.charAt(str.length() - 1));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        fizzBuzz1(18);
        System.out.println(fizzBuzz2(15));
        System.out.println(findSumNumbers("a1b4c 6#"));
        System.out.println(findBiggestNumber("a1b4c 6#"));
        System.out.println(countSequenceOfCharacters("abc"));
    }
}