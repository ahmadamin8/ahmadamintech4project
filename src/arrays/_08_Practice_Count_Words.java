package arrays;

import java.util.Arrays;

public class _08_Practice_Count_Words {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        String s1 = "Today is Tuesday";

        System.out.println(s1.split(" ").length);


        System.out.println("-----TASK 2-----");

        String s2 = "Some countries I visited were Argentina, Belgium and Malta";
        String[] task2 = s2.split(" ");

        int countA = 0;

        for (String element : task2) {
            if(element.toLowerCase().startsWith("a")) countA++;

        }
        System.out.println(countA);







    }
}
