package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework16Testing {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        String str1 = "Selenium is the most common UI automation tool";

        System.out.println(Homework16.countWords(str1));


        System.out.println("-----TASK 2-----");

        String str2 = "TechGlobal is a QA bootcamp";

        System.out.println(Homework16.countA(str2));


        System.out.println("-----TASK 3-----");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(-45);
        numbers.add(0);
        numbers.add(0);
        numbers.add(34);
        numbers.add(5);
        numbers.add(67);

        System.out.println(Homework16.countPos(numbers));


        System.out.println("-----TASK 4-----");

        ArrayList<Integer> task4List = new ArrayList<>();
        task4List.add(10);
        task4List.add(20);
        task4List.add(35);
        task4List.add(20);
        task4List.add(35);
        task4List.add(60);
        task4List.add(70);
        task4List.add(60);
        System.out.println(Homework16.removeDuplicateNumbers(task4List));


        System.out.println("-----TASK 5-----");

        ArrayList<String> task5 = new ArrayList<>();
        task5.add("java");
        task5.add("C#");
        task5.add("ruby");
        task5.add("JAVA");
        task5.add("ruby");
        task5.add("C#");
        task5.add("C++");
        System.out.println(Homework16.removeDuplicateElements(task5));


        System.out.println("-----TASK 6-----");

        String str = "   I am   learning   Java   ";

        System.out.println(Homework16.removeExtraSpaces(str));


        System.out.println("-----TASK 7-----");

        int[] arr1 = {3 , 0 , 0 , 7 , 5 , 10};
        int[] arr2 = {6 , 3 , 2};

        System.out.println(Arrays.toString(Homework16.add(arr1 , arr2)));


        System.out.println("-----TASK 8-----");

        int[] nums = {10 , -13 , 5 , 70 , 15 , 57};
        System.out.println(Homework16.findClosestTo10(nums));



    }
}



