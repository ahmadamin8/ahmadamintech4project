package homeworks;

import java.util.ArrayList;
import java.util.List;

public class Homework14 {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        int[] task1Arr = {-4, 0, -7, 0, 5, 10, 45, 45};
        boolean firstDuplicate = false;

        for (int i = 0; i < task1Arr.length; i++) {
            for (int j = i + 1; j < task1Arr.length; j++) {
                if (task1Arr[i] == task1Arr[j] && !firstDuplicate) {
                    System.out.println(task1Arr[i]);
                    firstDuplicate = true;
                }
            }
        }

        if (!firstDuplicate) System.out.println("There is no duplicates");


        System.out.println("-----TASK 2-----");

        String[] task2Arr = {"xyz" , "java" , "abc"};
        boolean task2Duplicate = false;

        for (int i = 0; i < task2Arr.length; i++) {
            for (int j = i + 1; j < task2Arr.length; j++) {
                if (task2Arr[i].equalsIgnoreCase(task2Arr[j]) && !task2Duplicate) {
                    System.out.println(task2Arr[i]);
                    task2Duplicate = true;
                }
            }
        }
        if (!task2Duplicate) System.out.println("There is no duplicates");


        System.out.println("-----TASK 3-----");

        int[] task3Arr = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        ArrayList<Integer> task3Duplicate = new ArrayList<>();

        for (int i = 0; i < task3Arr.length; i++) {
            for (int j = i + 1; j < task3Arr.length; j++) {
                if (task3Arr[i] == task3Arr[j] && !task3Duplicate.contains(task3Arr[i])) {
                    System.out.println(task3Arr[i]);
                    task3Duplicate.add(task3Arr[i]);
                }
            }
        }
        if (task3Duplicate.isEmpty()) System.out.println("There is no duplicates");


        System.out.println("-----TASK 4-----");

        String[] task4Arr = {"A", "foo", "12", "Foo", "bar", "a", "a", "Java"};
        ArrayList<String> task4Duplicate = new ArrayList<>();

        for (int i = 0; i < task4Arr.length; i++) {
            for (int j = i + 1; j < task4Arr.length; j++) {

                if (task4Arr[i].equalsIgnoreCase(task4Arr[j]) && !task4Duplicate.contains(task4Arr[i].toLowerCase())){
                    System.out.println(task4Arr[i]);
                    task4Duplicate.add(task4Arr[i].toLowerCase());
                }
            }
        }
        if (task4Duplicate.isEmpty()) System.out.println("There is no duplicates");


        System.out.println("-----TASK 5-----");

        String[] task5Arr = {"abc", "foo", "bar"};
        ArrayList<String> reverse = new ArrayList<>();

        for (int i = task5Arr.length-1; i >= 0 ; i--) {
            reverse.add(task5Arr[i]);

        }
        System.out.println(reverse);



        System.out.println("-----TASK 6-----");

        String task6Str = "Java is fun";
        String reversedString = "";
        String[] task6Array = task6Str.split(" ");


        for (int i = 0; i < task6Array.length ; i++) {
            String reversedString2 = "";
            for (int j = task6Array[i].length()-1; j >= 0; j--) {
                reversedString2 += task6Array[i].charAt(j);
            }
            reversedString += reversedString2 + " ";
        }
        System.out.println(reversedString.trim());
    }
        }

















