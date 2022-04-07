package homeworks;

import utilities.RandomNumberGenerator;

public class Homework13 {
    public static void main(String[] args) {

        System.out.println("-----TASK 1-----");

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0 && i % 5 == 0) System.out.println("FooBar");

            else if (i % 5 == 0) System.out.println("Bar");

            else if (i % 2 == 0) System.out.println("Foo");

            else System.out.println(i);
        }


        System.out.println("-----TASK 2-----");

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        boolean firstPositive = false;
        boolean firstNegative = false;
        int positive = 0;
        int negative = 0;

        for (int number : numbers) {
            if (number > 0 && !firstPositive) {
                firstPositive = true;
                positive = number;


            } else if (number < 0 && !firstNegative) {
                firstNegative = true;
                negative = number;


            }
            if(firstNegative && firstPositive) break;

        }
        System.out.println("First positive number is: " + positive);
        System.out.println("First negative number is: " + negative);

        System.out.println("-----TASK 3-----");

        int random1 = RandomNumberGenerator.getRandomNumber(1, 10);
        int random2 = RandomNumberGenerator.getRandomNumber(1, 10);
        int random3 = RandomNumberGenerator.getRandomNumber(1, 10);
        int random4 = RandomNumberGenerator.getRandomNumber(1, 10);
        int random5 = RandomNumberGenerator.getRandomNumber(1, 10);
        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);
        System.out.println(random4);
        System.out.println(random5);

        int[] task3Array = {random1, random2, random3, random4, random5};

        boolean number2Or3Found = false;
        for (int i : task3Array) {
            if (i == 2 || i == 3) {
                number2Or3Found = true;

            }
        }
        System.out.println(number2Or3Found);


        System.out.println("-----TASK 4-----");

        String[] list = {"banana", "orange", "apple"};
        boolean appleFound = false;

        for (String element : list) {
            if (element.contains("apple")) {
                appleFound = true;

            }
        }
        System.out.println(appleFound);


        System.out.println("-----TASK 5-----");

        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};
        boolean matchingNumbers = false;

        for (int num1 : numbers1) {
            for (int num2 : numbers2) {
                if(num1 == num2){
                    matchingNumbers = true;
                    System.out.println(num1);
                }
            }
        }
        if(!matchingNumbers) System.out.println("There is no matching elements");



        System.out.println("-----TASK 6-----");

        String task6String = "baNana";

        String[] characters = new String[task6String.length()];

        for (int i = 0; i < task6String.length(); i++) {
            characters[i] = String.valueOf(task6String.charAt(i));

        }
        String duplicatedChars = "";

        for (int i = 0; i < characters.length; i++) {
            for (int j = i + 1; j < characters.length; j++) {
                if(characters[i].equalsIgnoreCase(characters[j]) && !duplicatedChars.contains(characters[i])){
                    System.out.println(characters[i]);
                    duplicatedChars += characters[j];
                }

            }

        }




            }

        }
















