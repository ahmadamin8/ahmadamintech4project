package collections.arrayLists;

import utilities.CharacterHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _01_Practice_Counting_ArrayList_Elements {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);

        System.out.println(numbers);


        System.out.println("-----TASK 2-----");
        int count = 0;

        for (Integer element : numbers) {
            if(element % 2 == 1) count++;

        }
        System.out.println("Odds = " + count);


        System.out.println("-----TASK 3-----");
        List<String> colors = new ArrayList<>();
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");
        System.out.println(colors);


        System.out.println("-----TASK 4-----");

        int count2 = 0;
        for (String element2 : colors) {
            if(CharacterHelper.isUppercase(element2.charAt(0))) count2++;
        }
        System.out.println(count2);
    }
}
