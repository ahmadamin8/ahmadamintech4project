package homeworks;

import utilities.CharacterHelper;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework15 {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        ArrayList<Integer> task1Array = new ArrayList<>();
        task1Array.add(10);
        task1Array.add(23);
        task1Array.add(67);
        task1Array.add(23);
        task1Array.add(78);

        System.out.println(task1Array.get(3));
        System.out.println(task1Array.get(0));
        System.out.println(task1Array.get(2));
        System.out.println(task1Array);


        System.out.println("-----TASK 2-----");

        ArrayList<String> task2Array = new ArrayList<>();
        task2Array.add("Blue");
        task2Array.add("Brown");
        task2Array.add("Red");
        task2Array.add("White");
        task2Array.add("Black");
        task2Array.add("Purple");

        System.out.println(task2Array.get(1));
        System.out.println(task2Array.get(3));
        System.out.println(task2Array.get(5));
        System.out.println(task2Array);


        System.out.println("-----TASK 3-----");

        ArrayList<Integer> task3Array = new ArrayList<>();
        task3Array.add(23);
        task3Array.add(-34);
        task3Array.add(-56);
        task3Array.add(0);
        task3Array.add(89);
        task3Array.add(100);

        System.out.println(task3Array);

        Collections.sort(task3Array);

        System.out.println(task3Array);


        System.out.println("-----TASK 4-----");

        ArrayList<String> task4Array = new ArrayList<>();
        task4Array.add("Istanbul");
        task4Array.add("Berlin");
        task4Array.add("Madrid");
        task4Array.add("Paris");

        System.out.println(task4Array);

        Collections.sort(task4Array);

        System.out.println(task4Array);


        System.out.println("-----TASK 5-----");

        ArrayList<String> task5Array = new ArrayList<>();
        task5Array.add("Spider Man");
        task5Array.add("Iron Man");
        task5Array.add("Black Panther");
        task5Array.add("Deadpool");
        task5Array.add("Captain America");

        System.out.println(task5Array);

        System.out.println(task5Array.contains("wolverine"));


        System.out.println("-----TASK 6-----");

        ArrayList<String> task6Array = new ArrayList<>();
        task6Array.add("Hulk");
        task6Array.add("Black Widow");
        task6Array.add("Captain America");
        task6Array.add("Iron Man");

        Collections.sort(task6Array);

        System.out.println(task6Array);

        System.out.println(task6Array.contains("Hulk") && task6Array.contains("Iron Man"));


        System.out.println("-----TASK 7-----");

        ArrayList<Character> task7Array = new ArrayList<>();
        task7Array.add('A');
        task7Array.add('x');
        task7Array.add('$');
        task7Array.add('%');
        task7Array.add('9');
        task7Array.add('*');
        task7Array.add('+');
        task7Array.add('F');
        task7Array.add('G');

        System.out.println(task7Array);

        for (Character character : task7Array) {
            System.out.println(character);
        }


        System.out.println("-----TASK 8-----");


        ArrayList<String> task8Array = new ArrayList<>();
        task8Array.add("Desk");
        task8Array.add("Laptop");
        task8Array.add("Mouse");
        task8Array.add("Monitor");
        task8Array.add("Mouse-Pad");
        task8Array.add("Adapter");

        System.out.println(task8Array);

        Collections.sort(task8Array);

        System.out.println(task8Array);


        int task8Count = 0;

        for (String element : task8Array) {
            if(element.startsWith("M") || element.startsWith("m")) task8Count++;

        }
        System.out.println(task8Count);

        int hasAOrE = 0;

        for (String s : task8Array) {
            if(!s.contains("A") && !s.contains("a") && !s.contains("E") && !s.contains("e")) hasAOrE++;

        }
        System.out.println(hasAOrE);


        System.out.println("-----TASK 9-----");

        ArrayList<String> task9Array = new ArrayList<>();
        task9Array.add("Plate");
        task9Array.add("spoon");
        task9Array.add("fork");
        task9Array.add("Knife");
        task9Array.add("cup");
        task9Array.add("Mixer");

        System.out.println(task9Array);

        int upperCase = 0;
        int lowerCase = 0;
        int hasP = 0;
        int startsWithP = 0;

        for (String element : task9Array) {
            if(Character.isUpperCase(element.charAt(0))) upperCase++;
            else lowerCase++;

            if(element.contains("P") || element.contains("p"));{
                hasP++;
                if(element.toLowerCase().startsWith("p") || element.toLowerCase().endsWith("p")) startsWithP++;
            }
        }
        System.out.println("Elements starts with uppercase = " + upperCase);
        System.out.println("Elements starts with lowercase = " + lowerCase);
        System.out.println("Elements having P or p = " + hasP);
        System.out.println("Elements starting or ending with P or p = " + startsWithP);


        System.out.println("-----TASK 10-----");

        ArrayList<Integer> task10Array = new ArrayList<>();
        task10Array.add(3);
        task10Array.add(5);
        task10Array.add(7);
        task10Array.add(10);
        task10Array.add(0);
        task10Array.add(20);
        task10Array.add(17);
        task10Array.add(10);
        task10Array.add(23);
        task10Array.add(56);
        task10Array.add(78);

        int dividedBy10 = 0;
        int evenGreater15 = 0;
        int oddLess20 = 0;
        int less15Greater50 = 0;

        for (Integer element : task10Array) {
            if(element % 10 == 0) dividedBy10++;
            if(element % 2 == 0 && element > 15) evenGreater15++;
            if(element % 2 == 1 && element < 20) oddLess20++;
            if(element < 15 || element > 50) less15Greater50++;

        }
        System.out.println(task10Array);
        System.out.println("Elements that can be divided by 10 = " + dividedBy10);
        System.out.println("Elements that are even and greater than 15 = " + evenGreater15);
        System.out.println("Elements that are odd numbers are less than 20 = " + oddLess20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + less15Greater50);
    }
}

