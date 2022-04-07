package homeworks;

import utilities.ScannerHelper;
import utilities.StringHelper;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        String task1String = null;

        if (task1String.length() == 0) System.out.println("Length is zero");
        else{
            System.out.println("Length is = " + task1String.length());
            System.out.println("First char is = " + task1String.charAt(0));
            System.out.println("Last char is = " + (task1String.substring(task1String.length()-1)));
            if (task1String.contains("a") || task1String.contains("e") ||task1String.contains("i") || task1String.contains("o")
                    || task1String.contains("u") || task1String.contains("A") || task1String.contains("E")
                    || task1String.contains("I") || task1String.contains("O") || task1String.contains("U")){
                System.out.println("This string has vowel");
            }
            else System.out.println("This string does not have vowel");
            }


        System.out.println("-----Task 2-----");

        String task2String = null;

        if(task2String.length() < 3) System.out.println("Length is less than 3");
        else System.out.println(StringHelper.getMiddle(task2String));

        System.out.println("-----TASK 3-----");

        String task3String = null;
        String task3First2 = task3String.substring(0 , 2);
        String task3Last2 = task3String.substring((task3String.length()-2));
        String middle = StringHelper.getMiddle(task3String);

        if(task3String.length() < 4) System.out.println("INVALID INPUT");
        else if(task3String.length() == 4) System.out.println("First 2 characters are = " + task3First2 +
                                            "\n Last 2 characters are = " + task3Last2 +
                                            "\n The other characters are = ");
        else if(task3String.length() >= 4) System.out.println("First 2 characters are = " + task3First2 +
                                           "\n Last 2 characters are = " + task3Last2 +
                                           "\n The other characters are = " + middle);

        System.out.println("-----TASK 4-----");

        String task4String = null;
        String task4First2 = task4String.substring(0 , 2);
        String task4Last2 = task4String.substring((task4String.length()-2));

        if(task4String.length() < 2) System.out.println("Length is less than 2");
        else if(task4String.length() >= 2 && task4First2.equals(task4Last2)) System.out.println(true);
        else System.out.println(false);

        System.out.println("-----TASK 5");

        String task5String1 = null;
        String task5String2 = null;

        if(task5String1.length() < 2 || task5String2.length() <2) System.out.println("Invalid input!");
        else{
            System.out.println(task5String1.substring(1,task5String1.length()-1)+task5String2.substring(1,task5String2.length()-1));
        }

        System.out.println("-----TASK 6-----");

        String task6String = null;
        String task6First2 = task6String.substring(0 , 2);
        String task6Last2 = task6String.substring((task6String.length()-2));

        if(task6String.length() < 4) System.out.println("INVALID INPUT");
        else if(task6First2.contains("xx") && task6Last2.contains("xx")) System.out.println(true);
        else System.out.println(false);
    }


}
